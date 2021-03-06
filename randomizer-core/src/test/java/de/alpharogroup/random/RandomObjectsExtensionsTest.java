/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.random;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.lang.reflect.InvocationTargetException;
import java.nio.CharBuffer;
import java.util.Optional;

import org.meanbean.test.BeanTestException;
import org.meanbean.test.BeanTester;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import de.alpharogroup.BaseTestCase;

/**
 * The unit test class for the class {@link RandomObjectsExtensions}.
 *
 * @version 1.0
 * @author Asterios Raptis
 */
public class RandomObjectsExtensionsTest extends BaseTestCase
{

	boolean expected;

	/**
	 * {@inheritDoc}
	 */
	@Override
	@BeforeMethod
	public void setUp() throws Exception
	{
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@AfterMethod
	public void tearDown() throws Exception
	{
	}

	/**
	 * Test method for {@link RandomObjectsExtensions#getInfomailFromWebsite(java.lang.String)} .
	 */
	@Test
	public void testGetInfomailFromWebsite()
	{
		final CharBuffer charBuffer = CharBuffer
			.allocate(RandomCharacters.lowcaseWithNumbers.getCharacters().length());
		charBuffer.put(RandomCharacters.lowcaseWithNumbers.getCharacters());
		final String url = RandomObjectsExtensions.getRandomWebsite();
		final String emailprefix = "info@";

		expected = true;
		for (int i = 0; i < 10; i++)
		{
			final String randomInfomail = RandomObjectsExtensions.getInfomailFromWebsite(url);
			actual = randomInfomail.startsWith(emailprefix);

			assertEquals(expected, actual.booleanValue());

			actual = randomInfomail.contains(charBuffer);

			assertEquals(expected, actual.booleanValue());
		}
		String shortUrl = url.substring(7);
		for (int i = 0; i < 10; i++)
		{

			final String randomInfomail = RandomObjectsExtensions.getInfomailFromWebsite(shortUrl);
			actual = randomInfomail.startsWith(emailprefix);

			assertEquals(expected, actual.booleanValue());

			actual = randomInfomail.contains(charBuffer);

			assertEquals(expected, actual.booleanValue());
		}
	}

	/**
	 * Test method for {@link RandomObjectsExtensions#getInfomailFromWebsite(java.lang.String)} .
	 */
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testGetInfomailFromWebsiteExEx()
	{
		RandomObjectsExtensions.getInfomailFromWebsite("htp://ww.g.rw");
	}

	/**
	 * Test method for {@link RandomObjectsExtensions#getRandomEmail()}.
	 */
	@Test
	public void testGetRandomEmail()
	{
		final CharBuffer charBuffer = CharBuffer
			.allocate(RandomCharacters.lowcaseWithNumbers.getCharacters().length());
		charBuffer.put(RandomCharacters.lowcaseWithNumbers.getCharacters());

		expected = true;
		for (int i = 0; i < 100; i++)
		{
			final String randomEmail = RandomObjectsExtensions.getRandomEmail();
			actual = randomEmail.contains(charBuffer);

			assertEquals(expected, actual.booleanValue());
		}
	}

	/**
	 * Test method for {@link RandomObjectsExtensions#getRandomFaxnumber(java.lang.String)}.
	 */
	@Test
	public void testGetRandomFaxnumber()
	{
		final CharBuffer charBuffer = CharBuffer
			.allocate(RandomCharacters.numbers.getCharacters().length());
		charBuffer.put(RandomCharacters.numbers.getCharacters());

		expected = true;
		for (int i = 0; i < 100; i++)
		{
			final String randomPhonenumber = RandomObjectsExtensions.getRandomPhonenumber();
			final String randomFaxnumber = RandomObjectsExtensions
				.getRandomFaxnumber(randomPhonenumber);
			actual = randomFaxnumber.contains(charBuffer);

			assertEquals(expected, actual.booleanValue());
		}
	}

	/**
	 * Test method for {@link RandomObjectsExtensions#getRandomMobilnumber()}.
	 */
	@Test
	public void testGetRandomMobilnumber()
	{
		final CharBuffer charBuffer = CharBuffer
			.allocate(RandomCharacters.numbers.getCharacters().length());
		charBuffer.put(RandomCharacters.numbers.getCharacters());

		expected = true;
		for (int i = 0; i < 100; i++)
		{
			final String randomMobilnumber = RandomObjectsExtensions.getRandomMobilnumber();
			actual = randomMobilnumber.contains(charBuffer);

			assertEquals(expected, actual.booleanValue());
		}
	}

	/**
	 * Test method for {@link RandomObjectsExtensions#getRandomPassword(int)}.
	 */
	@Test
	public void testGetRandomPasswordInt()
	{
		final CharBuffer charBuffer = CharBuffer.allocate(26);
		final int length = 5;
		final String chars = RandomCharacters.lowcase.getCharacters();
		charBuffer.put(chars);

		expected = true;
		for (int i = 0; i < 100; i++)
		{
			final String randomPassword = RandomObjectsExtensions.getRandomPassword(length);
			actual = randomPassword.contains(charBuffer);

			assertEquals(expected, actual.booleanValue());
		}
	}

	/**
	 * Test method for {@link RandomObjectsExtensions#getRandomPassword(Optional)}.
	 */
	@Test
	public void testGetRandomPasswordOptionalInt()
	{
		final CharBuffer charBuffer = CharBuffer.allocate(26);
		final int length = 5;
		Optional<Integer> optLength = Optional.of(length);
		final String chars = RandomCharacters.lowcase.getCharacters();
		charBuffer.put(chars);

		expected = true;
		for (int i = 0; i < 10; i++)
		{
			final String randomPassword = RandomObjectsExtensions.getRandomPassword(optLength);
			actual = randomPassword.contains(charBuffer);

			assertEquals(expected, actual.booleanValue());
		}

		optLength = Optional.empty();
		expected = true;
		for (int i = 0; i < 10; i++)
		{
			final String randomPassword = RandomObjectsExtensions.getRandomPassword(optLength);
			actual = randomPassword.contains(charBuffer);

			assertEquals(expected, actual.booleanValue());
		}
	}

	/**
	 * Test method for {@link RandomObjectsExtensions#getRandomPhonenumber()}.
	 */
	@Test
	public void testGetRandomPhonenumber()
	{
		final CharBuffer charBuffer = CharBuffer
			.allocate(RandomCharacters.numbers.getCharacters().length());
		charBuffer.put(RandomCharacters.numbers.getCharacters());

		expected = true;
		for (int i = 0; i < 100; i++)
		{
			final String randomPhonenumber = RandomObjectsExtensions.getRandomPhonenumber();
			actual = randomPhonenumber.contains(charBuffer);

			assertEquals(expected, actual.booleanValue());
		}
	}

	/**
	 * Test method for {@link RandomObjectsExtensions#getRandomWebsite()}.
	 */
	@Test
	public void testGetRandomWebsite()
	{
		final CharBuffer charBuffer = CharBuffer
			.allocate(RandomCharacters.lowcaseWithNumbers.getCharacters().length());
		charBuffer.put(RandomCharacters.lowcaseWithNumbers.getCharacters());

		expected = true;
		for (int i = 0; i < 100; i++)
		{
			final String randomWebsite = RandomObjectsExtensions.getRandomWebsite();
			actual = randomWebsite.contains(charBuffer);

			assertEquals(expected, actual.booleanValue());
		}
	}

	/**
	 * Test method for {@link RandomObjectsExtensions#newRandomId()}.
	 */
	@Test
	public void testNewRandomId()
	{
		for (int i = 0; i < 10; i++)
		{
			String newRandomId = RandomObjectsExtensions.newRandomId();
			assertNotNull(newRandomId);
		}
	}

	/**
	 * Test method for {@link RandomObjectsUtils#newRandomName(char[])} .
	 */
	@Test
	public void testNewRandomName()
	{
		final CharBuffer charBuffer = CharBuffer
			.allocate(RandomCharacters.lowcaseWithNumbers.getCharacters().length());
		charBuffer.put(RandomCharacters.lowcaseWithNumbers.getCharacters());
		final char[] donatedChars = RandomCharacters.lowcaseWithNumbers.getCharacters()
			.toCharArray();

		expected = true;
		for (int i = 0; i < 100; i++)
		{
			final String randomName = RandomObjectsExtensions.newRandomName(donatedChars);
			actual = randomName.contains(charBuffer);

			assertEquals(expected, actual.booleanValue());
		}
	}

	/**
	 * Test method for {@link RandomObjectsExtensions} with {@link BeanTester}
	 */
	@Test(expectedExceptions = { BeanTestException.class, InvocationTargetException.class,
			UnsupportedOperationException.class })
	public void testWithBeanTester()
	{
		final BeanTester beanTester = new BeanTester();
		beanTester.testBean(RandomObjectsExtensions.class);
	}

}
