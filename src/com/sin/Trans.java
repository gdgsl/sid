package com.sin;

public class Trans {

	public String translator(String transText) {
		int nVowels;
		String consonants[] = new String[46];
		String consonantsUni[] = new String[46];
		String vowels[] = new String[26];
		String vowelsUni[] = new String[26];
		String vowelModifiersUni[] = new String[26];
		String specialConsonantsUni[] = new String[6];
		String specialConsonants[] = new String[6];
		String specialCharUni[] = new String[2];
		String specialChar[] = new String[2];

		vowelsUni[0] = "ඌ";
		vowels[0] = "oo";
		vowelModifiersUni[0] = "ූ";
		vowelsUni[1] = "ඕ";
		vowels[1] = "o\\)";
		vowelModifiersUni[1] = "ෝ";
		vowelsUni[2] = "ඕ";
		vowels[2] = "oe";
		vowelModifiersUni[2] = "ෝ";
		vowelsUni[3] = "ආ";
		vowels[3] = "aa";
		vowelModifiersUni[3] = "ා";
		vowelsUni[4] = "ආ";
		vowels[4] = "a\\)";
		vowelModifiersUni[4] = "ා";
		vowelsUni[5] = "ඈ";
		vowels[5] = "Aa";
		vowelModifiersUni[5] = "ෑ";
		vowelsUni[6] = "ඈ";
		vowels[6] = "A\\)";
		vowelModifiersUni[6] = "ෑ";
		vowelsUni[7] = "ඈ";
		vowels[7] = "ae";
		vowelModifiersUni[7] = "ෑ";
		vowelsUni[8] = "ඊ";
		vowels[8] = "ii";
		vowelModifiersUni[8] = "ී";
		vowelsUni[9] = "ඊ";
		vowels[9] = "i\\)";
		vowelModifiersUni[9] = "ී";
		vowelsUni[10] = "ඊ";
		vowels[10] = "ie";
		vowelModifiersUni[10] = "ී";
		vowelsUni[11] = "ඊ";
		vowels[11] = "ee";
		vowelModifiersUni[11] = "ී";
		vowelsUni[12] = "ඒ";
		vowels[12] = "ea";
		vowelModifiersUni[12] = "ේ";
		vowelsUni[13] = "ඒ";
		vowels[13] = "e\\)";
		vowelModifiersUni[13] = "ේ";
		vowelsUni[14] = "ඒ";
		vowels[14] = "ei";
		vowelModifiersUni[14] = "ේ";
		vowelsUni[15] = "ඌ";
		vowels[15] = "uu";
		vowelModifiersUni[15] = "ූ";
		vowelsUni[16] = "ඌ";
		vowels[16] = "u\\)";
		vowelModifiersUni[16] = "ූ";
		vowelsUni[17] = "ඖ";
		vowels[17] = "au";
		vowelModifiersUni[17] = "ෞ";
		vowelsUni[18] = "ඇ";
		vowels[18] = "/\\a";
		vowelModifiersUni[18] = "ැ";

		vowelsUni[19] = "අ";
		vowels[19] = "a";
		vowelModifiersUni[19] = "";
		vowelsUni[20] = "ඇ";
		vowels[20] = "A";
		vowelModifiersUni[20] = "ැ";
		vowelsUni[21] = "ඉ";
		vowels[21] = "i";
		vowelModifiersUni[21] = "ි";
		vowelsUni[22] = "එ";
		vowels[22] = "e";
		vowelModifiersUni[22] = "ෙ";
		vowelsUni[23] = "උ";
		vowels[23] = "u";
		vowelModifiersUni[23] = "ු";
		vowelsUni[24] = "ඔ";
		vowels[24] = "o";
		vowelModifiersUni[24] = "ො";
		vowelsUni[25] = "ඓ";
		vowels[25] = "I";
		vowelModifiersUni[25] = "ෛ";
		nVowels = 26;

		specialConsonantsUni[0] = "ං";
		specialConsonants[0] = "/\\n/g";
		specialConsonantsUni[1] = "ඃ";
		specialConsonants[1] = "/\\h/g";
		specialConsonantsUni[2] = "ඞ";
		specialConsonants[2] = "/\\N/g";
		specialConsonantsUni[3] = "ඍ";
		specialConsonants[3] = "/\\R/g";
		// special characher Repaya
		specialConsonantsUni[4] = "ර්" + "\u200D";
		specialConsonants[4] = "/R/g";
		specialConsonantsUni[5] = "ර්" + "\u200D";
		specialConsonants[5] = "/\\r/g";

		consonantsUni[0] = "ඬ";
		consonants[0] = "nnd";
		consonantsUni[1] = "ඳ";
		consonants[1] = "nndh";
		consonantsUni[2] = "ඟ";
		consonants[2] = "nng";
		consonantsUni[3] = "ථ";
		consonants[3] = "Th";
		consonantsUni[4] = "ධ";
		consonants[4] = "Dh";
		consonantsUni[5] = "ඝ";
		consonants[5] = "gh";
		consonantsUni[6] = "ඡ";
		consonants[6] = "Ch";
		consonantsUni[7] = "ඵ";
		consonants[7] = "ph";
		consonantsUni[8] = "භ";
		consonants[8] = "bh";
		consonantsUni[9] = "ශ";
		consonants[9] = "sh";
		consonantsUni[10] = "ෂ";
		consonants[10] = "Sh";
		consonantsUni[11] = "ඥ";
		consonants[11] = "GN";
		consonantsUni[12] = "ඤ";
		consonants[12] = "KN";
		consonantsUni[13] = "ළු";
		consonants[13] = "Lu";
		consonantsUni[14] = "ද";
		consonants[14] = "dh";
		consonantsUni[15] = "ච";
		consonants[15] = "ch";
		consonantsUni[16] = "ඛ";
		consonants[16] = "kh";
		consonantsUni[17] = "ත";
		consonants[17] = "th";

		consonantsUni[18] = "ට";
		consonants[18] = "t";
		consonantsUni[19] = "ක";
		consonants[19] = "k";
		consonantsUni[20] = "ඩ";
		consonants[20] = "d";
		consonantsUni[21] = "න";
		consonants[21] = "n";
		consonantsUni[22] = "ප";
		consonants[22] = "p";
		consonantsUni[23] = "බ";
		consonants[23] = "b";
		consonantsUni[24] = "ම";
		consonants[24] = "m";
		consonantsUni[25] = "‍ය";
		consonants[25] = "\\u005C" + "y";
		consonantsUni[26] = "‍ය";
		consonants[26] = "Y";
		consonantsUni[27] = "ය";
		consonants[27] = "y";
		consonantsUni[28] = "ජ";
		consonants[28] = "j";
		consonantsUni[29] = "ල";
		consonants[29] = "l";
		consonantsUni[30] = "ව";
		consonants[30] = "v";
		consonantsUni[31] = "ව";
		consonants[31] = "w";
		consonantsUni[32] = "ස";
		consonants[32] = "s";
		consonantsUni[33] = "හ";
		consonants[33] = "h";
		consonantsUni[34] = "ණ";
		consonants[34] = "N";
		consonantsUni[35] = "ළ";
		consonants[35] = "L";
		consonantsUni[36] = "ඛ";
		consonants[36] = "K";
		consonantsUni[37] = "ඝ";
		consonants[37] = "G";
		consonantsUni[38] = "ඨ";
		consonants[38] = "T";
		consonantsUni[39] = "ඪ";
		consonants[39] = "D";
		consonantsUni[40] = "ඵ";
		consonants[40] = "P";
		consonantsUni[41] = "ඹ";
		consonants[41] = "B";
		consonantsUni[42] = "ෆ";
		consonants[42] = "f";
		consonantsUni[43] = "ඣ";
		consonants[43] = "q";
		consonantsUni[44] = "ග";
		consonants[44] = "g";
		// last because we need to ommit this in dealing with Rakaransha
		consonantsUni[45] = "ර";
		consonants[45] = "r";

		specialCharUni[0] = "ෲ";
		specialChar[0] = "ruu";
		specialCharUni[1] = "ෘ";
		specialChar[1] = "ru";
		// specialCharUni[2]="්‍ර"; specialChar[2]="ra";

		String s, r, v;
		String text = transText;
		// special consonents
		for (int i = 0; i < specialConsonants.length; i++) {
			text = text.replace(specialConsonants[i], specialConsonantsUni[i]);
		}
		// consonents + special Chars
		for (int i = 0; i < specialCharUni.length; i++) {
			for (int j = 0; j < consonants.length; j++) {
				s = consonants[j] + specialChar[i];
				v = consonantsUni[j] + specialCharUni[i];

				text = text.replaceAll(s, v);
			}
		}
		// consonants + Rakaransha + vowel modifiers
		for (int j = 0; j < consonants.length; j++) {
			for (int i = 0; i < vowels.length; i++) {
				s = consonants[j] + "r" + vowels[i];
				v = consonantsUni[j] + "්‍ර" + vowelModifiersUni[i];
				text = text.replaceAll(s, v);
			}
			s = consonants[j] + "r";
			v = consonantsUni[j] + "්‍ර";
			text = text.replaceAll(s, v);
		}
		// consonents + vowel modifiers
		for (int i = 0; i < consonants.length; i++) {
			for (int j = 0; j < nVowels; j++) {
				s = consonants[i] + vowels[j];
				v = consonantsUni[i] + vowelModifiersUni[j];
				text = text.replaceAll(s, v);
			}
		}

		// consonents + HAL
		for (int i = 0; i < consonants.length; i++) {

			text = text.replaceAll(consonants[i], consonantsUni[i] + "්");
		}

		// vowels
		for (int i = 0; i < vowels.length; i++) {

			text = text.replaceAll(vowels[i], vowelsUni[i]);
		}

		String new1 = text;

		return UnitoUni(new1);

	}

	public String UnitoUni(String text) {

		String Unicode[] = new String[140];
		String SettUni[] = new String[140];
		int SinhalaUnicodeStart = 3458;
		int SinhalaUnicodeEnd = 3572;
		int TamilUnicodeStart = 2947;
		int TamilUnicodeEnd = 3058;

		Unicode[0] = "ශ්‍රී";
		SettUni[0] = "໹";
		Unicode[1] = "ද්‍ර";
		SettUni[1] = "຿";
		Unicode[2] = "ක්‍ෂ";
		SettUni[2] = "໺";
		Unicode[3] = "ළු";
		SettUni[3] = "໸";
		Unicode[4] = "ළූ";
		SettUni[4] = "໸๡";

		Unicode[5] = "බ්‍රේ";
		SettUni[5] = "๧໣๫";
		Unicode[6] = "ඩ්‍රේ";
		SettUni[6] = "๧຋๫";
		Unicode[7] = "ධ්‍රේ";
		SettUni[7] = "๧໎๫";
		Unicode[8] = "ඹ්‍රේ";
		SettUni[8] = "๧໩๫";
		Unicode[9] = "ඛ්‍රේ";
		SettUni[9] = "๧๳๫";
		Unicode[10] = "බ්‍රේ";
		SettUni[10] = "๧໣๫";
		Unicode[11] = "ච්‍රේ";
		SettUni[11] = "๧๷๫";
		Unicode[12] = "ම්‍රේ";
		SettUni[12] = "๧໦๫";
		Unicode[13] = "ට්‍රේ";
		SettUni[13] = "๧຀๫";
		Unicode[14] = "ව්‍රේ";
		SettUni[14] = "๧໵๫";
		Unicode[15] = "ධ්‍රේ";
		SettUni[15] = "๧໎๫";

		Unicode[16] = "ඹේ";
		SettUni[16] = "๧໩";
		Unicode[17] = "ඡේ";
		SettUni[17] = "๧๽";
		Unicode[18] = "ඪේ";
		SettUni[18] = "๧ຑ๞";
		Unicode[19] = "ඛේ";
		SettUni[19] = "๧๳";
		Unicode[20] = "ඬේ";
		SettUni[20] = "๧ຓ";
		Unicode[21] = "බේ";
		SettUni[21] = "๧໣";
		Unicode[22] = "චේ";
		SettUni[22] = "๧๷";
		Unicode[23] = "ඩේ";
		SettUni[23] = "๧຋";
		Unicode[24] = "මේ";
		SettUni[24] = "๧໦";
		Unicode[25] = "ජේ";
		SettUni[25] = "๧๽";
		Unicode[26] = "රේ";
		SettUni[26] = "๧໮";
		Unicode[27] = "ටේ";
		SettUni[27] = "๧຀";
		Unicode[28] = "වේ";
		SettUni[28] = "๧໵";
		Unicode[29] = "ධේ";
		SettUni[29] = "๧໎";

		Unicode[30] = "(.)්‍රෝ";
		SettUni[30] = "๧$1๫๟๞";
		Unicode[31] = "(.)්‍රො";
		SettUni[31] = "๧$1๫๟";
		Unicode[32] = "(.)්‍රේ";
		SettUni[32] = "๧$1๞";
		Unicode[33] = "(.)්‍රෞ";
		SettUni[33] = "๧$1๫๨";
		Unicode[34] = "(.)්‍රෙ";
		SettUni[34] = "๧$1๫";
		Unicode[35] = "(.)්‍යෝ";
		SettUni[35] = "๧$1๯๟๞";
		Unicode[36] = "(.)්‍යො";
		SettUni[36] = "๧$1๯๟";
		Unicode[37] = "(.)්‍යෙ";
		SettUni[37] = "๧$1๯";
		Unicode[38] = "(.)්‍ය";
		SettUni[38] = "$1๯";
		Unicode[39] = "(.)ෛ";
		SettUni[39] = "๧๧$1";
		Unicode[40] = "(.)ෞ";
		SettUni[40] = "๧$1๨";
		Unicode[41] = "(.)ෝ";
		SettUni[41] = "๧$1๟๞";
		Unicode[42] = "(.)ො";
		SettUni[42] = "๧$1๟";
		Unicode[43] = "(.)ේ";
		SettUni[43] = "๧$1๞";
		Unicode[44] = "(.)ෙ";
		SettUni[44] = "๧$1";
		Unicode[45] = "්‍ර";
		SettUni[45] = "๫";
		Unicode[46] = "ර්‍(.)";
		SettUni[46] = "$1๭";

		Unicode[47] = "තු";
		SettUni[47] = "ත๩";
		Unicode[48] = "ගු";
		SettUni[48] = "ග๩";
		Unicode[49] = "ශු";
		SettUni[49] = "ශ๩";
		Unicode[50] = "කු";
		SettUni[50] = "ක๩";
		Unicode[51] = "තූ";
		SettUni[51] = "ත๪";
		Unicode[52] = "ගූ";
		SettUni[52] = "ග๪";
		Unicode[53] = "ශූ";
		SettUni[53] = "ශ๪";
		Unicode[54] = "කූ";
		SettUni[54] = "ක๪";
		Unicode[55] = "රු";
		SettUni[55] = "ර๠";
		Unicode[56] = "රූ";
		SettUni[56] = "ර๡";
		Unicode[57] = "ඳි";
		SettUni[57] = "໛";
		Unicode[58] = "ඳී";
		SettUni[58] = "ໞ";
		Unicode[59] = "දූ";
		SettUni[59] = "຾";
		Unicode[60] = "දී";
		SettUni[60] = "ຬ";
		Unicode[61] = "ලූ";
		SettUni[61] = "໴";
		Unicode[62] = "ඳූ";
		SettUni[62] = "ໟ";
		Unicode[63] = "ර්";
		SettUni[63] = "໮";
		Unicode[64] = "ඨි";
		SettUni[64] = "ຆ";
		Unicode[65] = "ඨී";
		SettUni[65] = "ຉ";
		Unicode[66] = "ඡී";
		SettUni[66] = "๿";
		Unicode[67] = "ඛ්";
		SettUni[67] = "๳";
		Unicode[68] = "ඛි";
		SettUni[68] = "๴";
		Unicode[69] = "ලු";
		SettUni[69] = "໳";
		Unicode[70] = "ඛී";
		SettUni[70] = "๵";
		Unicode[71] = "දි";
		SettUni[71] = "ຩ";
		Unicode[72] = "ච්";
		SettUni[72] = "๷";
		Unicode[73] = "ජ්";
		SettUni[73] = "๽";
		Unicode[74] = "රී";
		SettUni[74] = "໲";
		Unicode[75] = "ඪි";
		SettUni[75] = "ຏ";
		Unicode[76] = "ඪී";
		SettUni[76] = "ຐ";
		Unicode[77] = "චි";
		SettUni[77] = "๸";
		Unicode[78] = "ථි";
		SettUni[78] = "຦";
		Unicode[79] = "ථී";
		SettUni[79] = "ຨ";
		Unicode[80] = "ජී";
		SettUni[80] = "๿";
		Unicode[81] = "චී";
		SettUni[81] = "๹";
		Unicode[82] = "ඞ්";
		SettUni[82] = "๶";
		Unicode[83] = "ඵී";
		SettUni[83] = "໢";
		Unicode[84] = "ට්";
		SettUni[84] = "຀";
		Unicode[85] = "ඵි";
		SettUni[85] = "໡";
		Unicode[86] = "රි";
		SettUni[86] = "໱";
		Unicode[87] = "ටී";
		SettUni[87] = "຅";
		Unicode[88] = "ටි";
		SettUni[88] = "຃";
		Unicode[89] = "ඩ්";
		SettUni[89] = "຋";
		Unicode[90] = "ඩී";
		SettUni[90] = "ຎ";
		Unicode[91] = "ඩි";
		SettUni[91] = "ຌ";
		Unicode[92] = "ඬ්";
		SettUni[92] = "ຘ";
		Unicode[93] = "ඬි";
		SettUni[93] = "ຠ";
		Unicode[94] = "ධ්";
		SettUni[94] = "໎";
		Unicode[95] = "ඬී";
		SettUni[95] = "຤";
		Unicode[96] = "ධි";
		SettUni[96] = "໏";
		Unicode[97] = "ධී";
		SettUni[97] = "໚";
		Unicode[98] = "බි";
		SettUni[98] = "໤";
		Unicode[99] = "බ්";
		SettUni[99] = "໣";
		Unicode[100] = "බී";
		SettUni[100] = "໥";
		Unicode[101] = "ම්";
		SettUni[101] = "໦";
		Unicode[102] = "ජි";
		SettUni[102] = "๾";
		Unicode[103] = "මි";
		SettUni[103] = "໧";
		Unicode[104] = "ඹ්";
		SettUni[104] = "໩";
		Unicode[105] = "මී";
		SettUni[105] = "໨";
		Unicode[106] = "ඹි";
		SettUni[106] = "໪";
		Unicode[107] = "ව්";
		SettUni[107] = "໵";
		Unicode[108] = "ඹී";
		SettUni[108] = "໫";
		Unicode[109] = "ඳු";
		SettUni[109] = "ໟ";
		Unicode[110] = "වී";
		SettUni[110] = "໷";
		Unicode[111] = "වි";
		SettUni[111] = "໶";
		Unicode[112] = "ඞ්";
		SettUni[112] = "๶";
		Unicode[113] = "ඡි";
		SettUni[113] = "๻";
		Unicode[114] = "ඡ්";
		SettUni[114] = "๺";
		Unicode[115] = "දු";
		SettUni[115] = "຺";
		Unicode[116] = "ජ්";
		SettUni[116] = "๽";
		Unicode[117] = "ණි";
		SettUni[117] = "ຒ";
		Unicode[118] = "ණී";
		SettUni[118] = "ຓ";
		Unicode[119] = "ජී";
		SettUni[119] = "๿";
		Unicode[120] = "ඡි";
		SettUni[120] = "๼";
		Unicode[121] = "ඩි";
		SettUni[121] = "";
		Unicode[122] = "ඤු";
		SettUni[122] = "๬๱຺";
		Unicode[123] = "රැ";
		SettUni[123] = "໯";
		Unicode[124] = "රෑ";
		SettUni[124] = "໰";

		Unicode[125] = "ං";
		SettUni[125] = "๜";
		Unicode[126] = "ඃ";
		SettUni[126] = "๝";
		Unicode[127] = "ැ";
		SettUni[127] = "๠";
		Unicode[128] = "ෑ";
		SettUni[128] = "๡";
		Unicode[129] = "ෙ";
		SettUni[129] = "๧";
		Unicode[130] = "ු";
		SettUni[130] = "๤";
		Unicode[131] = "ි";
		SettUni[131] = "๢";
		Unicode[132] = "ූ";
		SettUni[132] = "๥";
		Unicode[133] = "ී";
		SettUni[133] = "๣";
		Unicode[134] = "ෘ";
		SettUni[134] = "๦";
		Unicode[135] = "ෲ";
		SettUni[135] = "๦๦";
		Unicode[136] = "ෟ";
		SettUni[136] = "๨";
		Unicode[137] = "ා";
		SettUni[137] = "๟";
		Unicode[138] = "්";
		SettUni[138] = "๞";
		Unicode[139] = "◌";
		SettUni[139] = "໻";

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= SinhalaUnicodeStart
					&& text.charAt(i) <= SinhalaUnicodeEnd) {

				for (i = 0; i < 140; i++) {

					text = text.replaceAll(Unicode[i], SettUni[i]);
				}

			}

		}
		return text;
	}

}
