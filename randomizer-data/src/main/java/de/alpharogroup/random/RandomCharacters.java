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

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * The enum {@link RandomCharacters}
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum RandomCharacters
{

	/** The lowcase. */
	lowcase(RandomCharacters.LOWCASECHARS),

	/** The lowcase with numbers. */
	lowcaseWithNumbers(RandomCharacters.LOWCASECHARS + RandomCharacters.NUMBERS),

	/** The lowcase with numbers and special. */
	lowcaseWithNumbersAndSpecial(
		RandomCharacters.LOWCASECHARS + RandomCharacters.NUMBERS + RandomCharacters.SPECIALCHARS),

	/** The lowcase with uppercase and numbers. */
	lowcaseWithUppercaseAndNumbers(RandomCharacters.LOWCASECHARS
		+ RandomCharacters.LOWCASECHARS.toUpperCase() + RandomCharacters.NUMBERS),

	/** The lowcase with uppercase and numbers and special. */
	lowcaseWithUppercaseAndNumbersAndSpecial(
		RandomCharacters.LOWCASECHARS + RandomCharacters.LOWCASECHARS.toUpperCase()
			+ RandomCharacters.NUMBERS + RandomCharacters.SPECIALCHARS),

	/** The numbers. */
	numbers(RandomCharacters.NUMBERS),

	/** The special. */
	special(RandomCharacters.SPECIALCHARS),

	/** The uppercase. */
	uppercase(RandomCharacters.LOWCASECHARS.toUpperCase()),

	/** The uppercase with numbers. */
	uppercaseWithNumbers(RandomCharacters.LOWCASECHARS.toUpperCase() + RandomCharacters.NUMBERS),

	/** The uppercase with numbers and special. */
	uppercaseWithNumbersAndSpecial(RandomCharacters.LOWCASECHARS.toUpperCase()
		+ RandomCharacters.NUMBERS + RandomCharacters.SPECIALCHARS);

	/** The alphabet-chars in lower case. */
	private static final String LOWCASECHARS = "abcdefghijklmnopqrstuvwxyz";

	/** All digits. */
	private static final String NUMBERS = "0123456789";

	/** All special Chars */
	private static final String SPECIALCHARS = "#@$%^&*?!";

	/** The allowed characters. */
	String characters;

	/**
	 * Instantiates a new {@link RandomCharacters}
	 *
	 * @param characters
	 *            the allowed characters
	 */
	private RandomCharacters(String characters)
	{
		this.characters = characters;
	}

}
