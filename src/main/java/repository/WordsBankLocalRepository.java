package repository;

import model.IrregularVerbTranslation;

import java.util.LinkedList;
import java.util.List;

public class WordsBankLocalRepository {
    private static final String[][] wordsArray = new String[141][4];

    public static String[][] fillWords() {

        wordsArray[0][0] = "arise";
        wordsArray[0][1] = "arose";
        wordsArray[0][2] = "arisen";
        wordsArray[0][3] = "POJAWIĆ SIĘ";

        wordsArray[1][0] = "awake";
        wordsArray[1][1] = "awoke";
        wordsArray[1][2] = "awoken";
        wordsArray[1][3] = "OBUDZIĆ";

        wordsArray[2][0] = "be/am/is/are";
        wordsArray[2][1] = "was/were";
        wordsArray[2][2] = "been";
        wordsArray[2][3] = "BYĆ";

        wordsArray[3][0] = "bear";
        wordsArray[3][1] = "bore";
        wordsArray[3][2] = "borne";
        wordsArray[3][3] = "ZNOSIĆ, UDŹWIGNĄĆ COŚ";

        wordsArray[4][0] = "beat";
        wordsArray[4][1] = "beat";
        wordsArray[4][2] = "beaten";
        wordsArray[4][3] = "ZBIĆ";

        wordsArray[5][0] = "become";
        wordsArray[5][1] = "became";
        wordsArray[5][2] = "become";
        wordsArray[5][3] = "STAWAĆ SIĘ / STAĆ SIĘ, ZOSTAWAĆ KIMŚ / ZOSTAWAĆ CZYMŚ";

        wordsArray[6][0] = "begin";
        wordsArray[6][1] = "began";
        wordsArray[6][2] = "begun";
        wordsArray[6][3] = "ZACZYNAĆ";

        wordsArray[7][0] = "bend";
        wordsArray[7][1] = "bent";
        wordsArray[7][2] = "bent";
        wordsArray[7][3] = "ZGINAĆ, NACHYLAĆ";

        wordsArray[8][0] = "bet";
        wordsArray[8][1] = "bet";
        wordsArray[8][2] = "bet";
        wordsArray[8][3] = "ZAKŁADAĆ SIĘ, OBSTAWIAĆ, OBSTAWIĆ";

        wordsArray[9][0] = "bind";
        wordsArray[9][1] = "bound";
        wordsArray[9][2] = "bound";
        wordsArray[9][3] = "WIĄZAĆ, ZŁĄCZYĆ";

        wordsArray[10][0] = "bite";
        wordsArray[10][1] = "bit";
        wordsArray[10][2] = "bitten";
        wordsArray[10][3] = "UGRYŹĆ";

        wordsArray[11][0] = "bleed";
        wordsArray[11][1] = "bled";
        wordsArray[11][2] = "bled";
        wordsArray[11][3] = "KRWAWIĆ";

        wordsArray[12][0] = "blow";
        wordsArray[12][1] = "blew";
        wordsArray[12][2] = "blown";
        wordsArray[12][3] = "WIAĆ, DMUCHAĆ";

        wordsArray[13][0] = "break";
        wordsArray[13][1] = "broke";
        wordsArray[13][2] = "broken";
        wordsArray[13][3] = "ŁAMAĆ";

        wordsArray[14][0] = "breed";
        wordsArray[14][1] = "bred";
        wordsArray[14][2] = "bred";
        wordsArray[14][3] = "HODOWAĆ, WYCHOWAĆ";

        wordsArray[15][0] = "bring";
        wordsArray[15][1] = "brought";
        wordsArray[15][2] = "brought";
        wordsArray[15][3] = "PRZYNOSIĆ";

        wordsArray[16][0] = "build";
        wordsArray[16][1] = "built";
        wordsArray[16][2] = "built";
        wordsArray[16][3] = "BUDOWAĆ";

        wordsArray[17][0] = "burn";
        wordsArray[17][1] = "burned/burnt";
        wordsArray[17][2] = "burned/burnt";
        wordsArray[17][3] = "PALIĆ, PARZYĆ";

        wordsArray[18][0] = "buy";
        wordsArray[18][1] = "bought";
        wordsArray[18][2] = "bought";
        wordsArray[18][3] = "KUPOWAĆ";

        wordsArray[19][0] = "cast";
        wordsArray[19][1] = "cast";
        wordsArray[19][2] = "cast";
        wordsArray[19][3] = "RZUCIĆ, ZRZUCAĆ";

        wordsArray[20][0] = "catch";
        wordsArray[20][1] = "caught";
        wordsArray[20][2] = "caught";
        wordsArray[20][3] = "ŁAPAĆ";

        wordsArray[21][0] = "choose";
        wordsArray[21][1] = "chose";
        wordsArray[21][2] = "chosen";
        wordsArray[21][3] = "WYBIERAC";

        wordsArray[22][0] = "cling";
        wordsArray[22][1] = "clung";
        wordsArray[22][2] = "clung";
        wordsArray[22][3] = "PRZYWRZEĆ, UCZEPIĆ SIĘ";

        wordsArray[23][0] = "come";
        wordsArray[23][1] = "came";
        wordsArray[23][2] = "come";
        wordsArray[23][3] = "PRZYJŚĆ,PRZYJECHAĆ";

        wordsArray[24][0] = "cost";
        wordsArray[24][1] = "cost";
        wordsArray[24][2] = "cost";
        wordsArray[24][3] = "KOSZTOWAĆ";

        wordsArray[25][0] = "creep";
        wordsArray[25][1] = "crept";
        wordsArray[25][2] = "crept";
        wordsArray[25][3] = "SKRADAĆ SIĘ, ZAKRADAĆ";

        wordsArray[26][0] = "cut";
        wordsArray[26][1] = "cut";
        wordsArray[26][2] = "cut";
        wordsArray[26][3] = "CIĄĆ, KROIĆ";

        wordsArray[27][0] = "deal";
        wordsArray[27][1] = "dealt";
        wordsArray[27][2] = "dealt";
        wordsArray[27][3] = "ROZDAWAĆ, MIEĆ DO CZYNIENIA";

        wordsArray[28][0] = "dig";
        wordsArray[28][1] = "dug";
        wordsArray[28][2] = "dug";
        wordsArray[28][3] = "KOPAĆ";

        wordsArray[29][0] = "do";
        wordsArray[29][1] = "did";
        wordsArray[29][2] = "done";
        wordsArray[29][3] = "ROBIĆ";

        wordsArray[30][0] = "draw";
        wordsArray[30][1] = "drew";
        wordsArray[30][2] = "drawn";
        wordsArray[30][3] = "RYSOWAĆ, POCIĄGNĄĆ";

        wordsArray[31][0] = "dream";
        wordsArray[31][1] = "dreamed/dreamt";
        wordsArray[31][2] = "dreamed/dreamt";
        wordsArray[31][3] = "ŚNIĆ, MARZYĆ";

        wordsArray[32][0] = "drink";
        wordsArray[32][1] = "drank";
        wordsArray[32][2] = "drunk";
        wordsArray[32][3] = "PIĆ";

        wordsArray[33][0] = "drive";
        wordsArray[33][1] = "drove";
        wordsArray[33][2] = "driven";
        wordsArray[33][3] = "PROWADZIĆ, KIEROWAĆ SIĘ CZYMŚ";

        wordsArray[34][0] = "eat";
        wordsArray[34][1] = "ate";
        wordsArray[34][2] = "eaten";
        wordsArray[34][3] = "JEŚĆ";

        wordsArray[35][0] = "fall";
        wordsArray[35][1] = "fell";
        wordsArray[35][2] = "fallen";
        wordsArray[35][3] = "UPADAĆ, PADAĆ, SPADAĆ";

        wordsArray[36][0] = "feed";
        wordsArray[36][1] = "fed";
        wordsArray[36][2] = "fed";
        wordsArray[36][3] = "KARMIĆ, ŻYWIĆ";

        wordsArray[37][0] = "feel";
        wordsArray[37][1] = "felt";
        wordsArray[37][2] = "felt";
        wordsArray[37][3] = "CZUĆ";

        wordsArray[38][0] = "fight";
        wordsArray[38][1] = "fought";
        wordsArray[38][2] = "fought";
        wordsArray[38][3] = "WALCZYĆ, BIĆ SIĘ";

        wordsArray[39][0] = "find";
        wordsArray[39][1] = "found";
        wordsArray[39][2] = "found";
        wordsArray[39][3] = "ZNALEŹĆ";

        wordsArray[40][0] = "fit";
        wordsArray[40][1] = "fit";
        wordsArray[40][2] = "fit";
        wordsArray[40][3] = "PASOWAĆ";

        wordsArray[41][0] = "flee";
        wordsArray[41][1] = "fled";
        wordsArray[41][2] = "fled";
        wordsArray[41][3] = "UMYKAĆ, UCIEKAĆ";

        wordsArray[42][0] = "fling";
        wordsArray[42][1] = "flung";
        wordsArray[42][2] = "flung";
        wordsArray[42][3] = "RZUCIĆ, CISNĄĆ";

        wordsArray[43][0] = "fly";
        wordsArray[43][1] = "flew";
        wordsArray[43][2] = "flown";
        wordsArray[43][3] = "LATAĆ";

        wordsArray[44][0] = "forbid";
        wordsArray[44][1] = "forbade";
        wordsArray[44][2] = "forbidden";
        wordsArray[44][3] = "ZABRANIAĆ";

        wordsArray[45][0] = "forget";
        wordsArray[45][1] = "forgot";
        wordsArray[45][2] = "forgotten";
        wordsArray[45][3] = "ZAPOMINAĆ";

        wordsArray[46][0] = "forgive";
        wordsArray[46][1] = "forgave";
        wordsArray[46][2] = "forgiven";
        wordsArray[46][3] = "WYBACZAĆ";

        wordsArray[47][0] = "forsake";
        wordsArray[47][1] = "forsook";
        wordsArray[47][2] = "forsaken";
        wordsArray[47][3] = "PORZUCAĆ, ZANIECHAĆ";

        wordsArray[48][0] = "fortell";
        wordsArray[48][1] = "fortold";
        wordsArray[48][2] = "fortold";
        wordsArray[48][3] = "PRZEPOWIADAĆ, PRZEWIDYWAĆ";

        wordsArray[49][0] = "freeze";
        wordsArray[49][1] = "froze";
        wordsArray[49][2] = "frozen";
        wordsArray[49][3] = "ZAMARZAĆ";

        wordsArray[50][0] = "get";
        wordsArray[50][1] = "got";
        wordsArray[50][2] = "got";
        wordsArray[50][3] = "DOSTAWAĆ";

        wordsArray[51][0] = "give";
        wordsArray[51][1] = "gave";
        wordsArray[51][2] = "given";
        wordsArray[51][3] = "DAWAĆ";

        wordsArray[52][0] = "go";
        wordsArray[52][1] = "went";
        wordsArray[52][2] = "gone";
        wordsArray[52][3] = "IŚĆ";

        wordsArray[53][0] = "grind";
        wordsArray[53][1] = "ground";
        wordsArray[53][2] = "ground";
        wordsArray[53][3] = "ROZKRUSZYĆ, ZEMLEĆ, ZGRZYTAĆ";

        wordsArray[54][0] = "grow";
        wordsArray[54][1] = "grew";
        wordsArray[54][2] = "grown";
        wordsArray[54][3] = "ROSNĄĆ";

        wordsArray[55][0] = "hang";
        wordsArray[55][1] = "hung";
        wordsArray[55][2] = "hung";
        wordsArray[55][3] = "ZAWIESZAĆ (NP. OBRAZ)";

        wordsArray[56][0] = "have";
        wordsArray[56][1] = "had";
        wordsArray[56][2] = "had";
        wordsArray[56][3] = "MIEĆ";

        wordsArray[57][0] = "hear";
        wordsArray[57][1] = "heard";
        wordsArray[57][2] = "heard";
        wordsArray[57][3] = "SŁYSZEĆ";

        wordsArray[58][0] = "hide";
        wordsArray[58][1] = "hid";
        wordsArray[58][2] = "hidden";
        wordsArray[58][3] = "CHOWAĆ, UKRYWAĆ";

        wordsArray[59][0] = "hit";
        wordsArray[59][1] = "hit";
        wordsArray[59][2] = "hit";
        wordsArray[59][3] = "UDERZAĆ";

        wordsArray[60][0] = "hold";
        wordsArray[60][1] = "held";
        wordsArray[60][2] = "held";
        wordsArray[60][3] = "TRZYMAĆ, UTRZYMYWAC";

        wordsArray[61][0] = "hurt";
        wordsArray[61][1] = "hurt";
        wordsArray[61][2] = "hurt";
        wordsArray[61][3] = "RANIĆ, BOLEĆ";

        wordsArray[62][0] = "keep";
        wordsArray[62][1] = "kept";
        wordsArray[62][2] = "kept";
        wordsArray[62][3] = "TRZYMAĆ";

        wordsArray[63][0] = "kneel";
        wordsArray[63][1] = "knelt/kneeled";
        wordsArray[63][2] = "knelt/kneeled";
        wordsArray[63][3] = "KLĘKAĆ, KLĘCZEĆ";

        wordsArray[64][0] = "knit";
        wordsArray[64][1] = "knit/knitted";
        wordsArray[64][2] = "knit/knitted";
        wordsArray[64][3] = "ROBIĆ NA DRUTACH";

        wordsArray[65][0] = "know";
        wordsArray[65][1] = "knew";
        wordsArray[65][2] = "known";
        wordsArray[65][3] = "ZNAĆ, WIEDZIEĆ";

        wordsArray[66][0] = "lay";
        wordsArray[66][1] = "laid";
        wordsArray[66][2] = "laid";
        wordsArray[66][3] = "POŁOŻYĆ, KŁAŚĆ (PUT)";

        wordsArray[67][0] = "lead";
        wordsArray[67][1] = "led";
        wordsArray[67][2] = "led";
        wordsArray[67][3] = "PROWADZIĆ";

        wordsArray[68][0] = "leap";
        wordsArray[68][1] = "leapt/leaped";
        wordsArray[68][2] = "leapt/leapded";
        wordsArray[68][3] = "SKOCZYĆ, SKAKAĆ";

        wordsArray[69][0] = "learn";
        wordsArray[69][1] = "learnt/learned";
        wordsArray[69][2] = "learnt/learned";
        wordsArray[69][3] = "UCZYĆ SIĘ";

        wordsArray[70][0] = "leave";
        wordsArray[70][1] = "left";
        wordsArray[70][2] = "left";
        wordsArray[70][3] = "OPUSZCZAĆ, WYJEŻDŻAĆ";

        wordsArray[71][0] = "lend";
        wordsArray[71][1] = "lent";
        wordsArray[71][2] = "lent";
        wordsArray[71][3] = "POŻYCZAĆ";

        wordsArray[72][0] = "let";
        wordsArray[72][1] = "let";
        wordsArray[72][2] = "let";
        wordsArray[72][3] = "POZWALAĆ";

        wordsArray[73][0] = "lie";
        wordsArray[73][1] = "lay";
        wordsArray[73][2] = "lain";
        wordsArray[73][3] = "LEŻEĆ, KŁAŚĆ SIĘ (RECLINE)";

        wordsArray[74][0] = "light";
        wordsArray[74][1] = "lighted/lit";
        wordsArray[74][2] = "lighted/lit";
        wordsArray[74][3] = "ZAPALAĆ, ROZPALAĆ, OŚWIETLAĆ";

        wordsArray[75][0] = "lose";
        wordsArray[75][1] = "lost";
        wordsArray[75][2] = "lost";
        wordsArray[75][3] = "TRACIĆ";

        wordsArray[76][0] = "make";
        wordsArray[76][1] = "made";
        wordsArray[76][2] = "made";
        wordsArray[76][3] = "ZROBIĆ";

        wordsArray[77][0] = "mean";
        wordsArray[77][1] = "meant";
        wordsArray[77][2] = "meant";
        wordsArray[77][3] = "ZNACZYĆ, OZNACZAĆ";

        wordsArray[78][0] = "meet";
        wordsArray[78][1] = "met";
        wordsArray[78][2] = "met";
        wordsArray[78][3] = "SPOTYKAĆ";

        wordsArray[79][0] = "pay";
        wordsArray[79][1] = "paid";
        wordsArray[79][2] = "paid";
        wordsArray[79][3] = "PŁACIĆ";

        wordsArray[80][0] = "prove";
        wordsArray[80][1] = "proved";
        wordsArray[80][2] = "proved/proven";
        wordsArray[80][3] = "UDOWADNIAĆ, DOWIEŚĆ";

        wordsArray[81][0] = "put";
        wordsArray[81][1] = "put";
        wordsArray[81][2] = "put";
        wordsArray[81][3] = "KŁAŚĆ";

        wordsArray[82][0] = "quit";
        wordsArray[82][1] = "quit";
        wordsArray[82][2] = "quit";
        wordsArray[82][3] = "RZUCAĆ, OPUSZCZAĆ";

        wordsArray[83][0] = "read";
        wordsArray[83][1] = "read";
        wordsArray[83][2] = "read";
        wordsArray[83][3] = "CZYTAĆ [RED]";

        wordsArray[84][0] = "ride";
        wordsArray[84][1] = "rode";
        wordsArray[84][2] = "ridden";
        wordsArray[84][3] = "JEŹDZIĆ";

        wordsArray[85][0] = "ring";
        wordsArray[85][1] = "rang";
        wordsArray[85][2] = "rung";
        wordsArray[85][3] = "DZWONIĆ";

        wordsArray[86][0] = "rise";
        wordsArray[86][1] = "rose";
        wordsArray[86][2] = "risen";
        wordsArray[86][3] = "PODNOSIĆ SIĘ, WZRASTAĆ";

        wordsArray[87][0] = "run";
        wordsArray[87][1] = "ran";
        wordsArray[87][2] = "run";
        wordsArray[87][3] = "BIEC";

        wordsArray[88][0] = "saw";
        wordsArray[88][1] = "sawed";
        wordsArray[88][2] = "sawn";
        wordsArray[88][3] = "PIŁOWAĆ";

        wordsArray[89][0] = "say";
        wordsArray[89][1] = "said";
        wordsArray[89][2] = "said";
        wordsArray[89][3] = "MÓWIĆ";

        wordsArray[90][0] = "see";
        wordsArray[90][1] = "saw";
        wordsArray[90][2] = "seen";
        wordsArray[90][3] = "WIDZIEĆ";

        wordsArray[91][0] = "seek";
        wordsArray[91][1] = "sought";
        wordsArray[91][2] = "sought";
        wordsArray[91][3] = "SZUKAC,POSZUKIWAĆ";

        wordsArray[92][0] = "sell";
        wordsArray[92][1] = "sold";
        wordsArray[92][2] = "sold";
        wordsArray[92][3] = "SPRZEDAWAĆ";

        wordsArray[93][0] = "send";
        wordsArray[93][1] = "sent";
        wordsArray[93][2] = "sent";
        wordsArray[93][3] = "WYSYŁAĆ, SŁAĆ";

        wordsArray[94][0] = "set";
        wordsArray[94][1] = "set";
        wordsArray[94][2] = "set";
        wordsArray[94][3] = "UMIESZCZAĆ, USTAWIAĆ";

        wordsArray[95][0] = "shake";
        wordsArray[95][1] = "shook";
        wordsArray[95][2] = "shaken";
        wordsArray[95][3] = "TRZĄŚĆ, POTRZĄSNĄĆ";

        wordsArray[96][0] = "shed";
        wordsArray[96][1] = "shed";
        wordsArray[96][2] = "shed";
        wordsArray[96][3] = "ZRZUCAĆ, POZBYWAĆ SIĘ";

        wordsArray[97][0] = "shine";
        wordsArray[97][1] = "shone";
        wordsArray[97][2] = "shone";
        wordsArray[97][3] = "ŚWIECIĆ, BŁYSZCZEĆ";

        wordsArray[98][0] = "shoot";
        wordsArray[98][1] = "shot";
        wordsArray[98][2] = "shot";
        wordsArray[98][3] = "STRZELAĆ";

        wordsArray[99][0] = "show";
        wordsArray[99][1] = "showed";
        wordsArray[99][2] = "shown";
        wordsArray[99][3] = "POKAZYWAĆ";

        wordsArray[100][0] = "shrink";
        wordsArray[100][1] = "shrank";
        wordsArray[100][2] = "shrunk";
        wordsArray[100][3] = "KURCZYĆ SIĘ, ZBIEGAĆ";

        wordsArray[101][0] = "shut";
        wordsArray[101][1] = "shut";
        wordsArray[101][2] = "shut";
        wordsArray[101][3] = "ZAMYKAĆ";

        wordsArray[102][0] = "sing";
        wordsArray[102][1] = "sang";
        wordsArray[102][2] = "sung";
        wordsArray[102][3] = "ŚPIEWAĆ";

        wordsArray[103][0] = "sink";
        wordsArray[103][1] = "sank";
        wordsArray[103][2] = "sunk";
        wordsArray[103][3] = "TONĄĆ (O STATKU), ZAPADAĆ SIĘ";

        wordsArray[104][0] = "sit";
        wordsArray[104][1] = "sat";
        wordsArray[104][2] = "sat";
        wordsArray[104][3] = "SIEDZIEĆ, SIADAĆ";

        wordsArray[105][0] = "slay";
        wordsArray[105][1] = "slew";
        wordsArray[105][2] = "slain";
        wordsArray[105][3] = "ZABIJAĆ";

        wordsArray[106][0] = "sleep";
        wordsArray[106][1] = "slept";
        wordsArray[106][2] = "slept";
        wordsArray[106][3] = "SPAĆ";

        wordsArray[107][0] = "slide";
        wordsArray[107][1] = "slid";
        wordsArray[107][2] = "slid";
        wordsArray[107][3] = "ŚLIZGAĆ SIĘ, ZJEŻDŻAĆ";

        wordsArray[108][0] = "sling";
        wordsArray[108][1] = "slung";
        wordsArray[108][2] = "slung";
        wordsArray[108][3] = "CISNĄĆ, MIOTAĆ";

        wordsArray[109][0] = "speak";
        wordsArray[109][1] = "spoke";
        wordsArray[109][2] = "spoken";
        wordsArray[109][3] = "MÓWIĆ (W JAKIMŚ JĘZYKU)";

        wordsArray[110][0] = "spend";
        wordsArray[110][1] = "spent";
        wordsArray[110][2] = "spent";
        wordsArray[110][3] = "SPEDZAĆ, WYDAWAĆ";

        wordsArray[111][0] = "spin";
        wordsArray[111][1] = "spun";
        wordsArray[111][2] = "spun";
        wordsArray[111][3] = "KRĘCIĆ, ZAKRĘCIĆ CZYMŚ/SIĘ";

        wordsArray[112][0] = "split";
        wordsArray[112][1] = "split";
        wordsArray[112][2] = "split";
        wordsArray[112][3] = "DZIELIĆ, ROZDZIELAĆ";

        wordsArray[113][0] = "spread";
        wordsArray[113][1] = "spread";
        wordsArray[113][2] = "spread";
        wordsArray[113][3] = "ROZKŁADAĆ, ROZPOŚCIERAĆ";

        wordsArray[114][0] = "spring";
        wordsArray[114][1] = "sprang";
        wordsArray[114][2] = "sprung";
        wordsArray[114][3] = "PRZESKAKIWAĆ, WYSKAKIWAĆ";

        wordsArray[115][0] = "stand";
        wordsArray[115][1] = "stood";
        wordsArray[115][2] = "stood";
        wordsArray[115][3] = "STAĆ";

        wordsArray[116][0] = "steal";
        wordsArray[116][1] = "stole";
        wordsArray[116][2] = "stolen";
        wordsArray[116][3] = "KRAŚĆ";

        wordsArray[117][0] = "stick";
        wordsArray[117][1] = "stuck";
        wordsArray[117][2] = "stuck";
        wordsArray[117][3] = "WBIJAĆ, WTYKAĆ, PRZYKLEJAĆ";

        wordsArray[118][0] = "sting";
        wordsArray[118][1] = "stung";
        wordsArray[118][2] = "stung";
        wordsArray[118][3] = "ŻĄDLIĆ";

        wordsArray[119][0] = "stink";
        wordsArray[119][1] = "stank";
        wordsArray[119][2] = "stunk";
        wordsArray[119][3] = "ŚMIERDZIEĆ, CUCHNĄĆ";

        wordsArray[120][0] = "strike";
        wordsArray[120][1] = "struck";
        wordsArray[120][2] = "struck";
        wordsArray[120][3] = "UDERZYĆ";

        wordsArray[121][0] = "strive";
        wordsArray[121][1] = "strove";
        wordsArray[121][2] = "striven";
        wordsArray[121][3] = "ZMAGAĆ SIĘ Z CZYMŚ";

        wordsArray[122][0] = "swear";
        wordsArray[122][1] = "swore";
        wordsArray[122][2] = "sworn";
        wordsArray[122][3] = "PRZYSIĘGAĆ, PRZEKLINAĆ ";

        wordsArray[123][0] = "sweep";
        wordsArray[123][1] = "swept";
        wordsArray[123][2] = "swept";
        wordsArray[123][3] = "ZMIATAĆ, ZAMIATAĆ";

        wordsArray[124][0] = "swim";
        wordsArray[124][1] = "swam";
        wordsArray[124][2] = "swum";
        wordsArray[124][3] = "PŁYWAĆ";

        wordsArray[125][0] = "swing";
        wordsArray[125][1] = "swung";
        wordsArray[125][2] = "swung";
        wordsArray[125][3] = "MACHNĄĆ, ZAKOŁYSAĆ";

        wordsArray[126][0] = "take";
        wordsArray[126][1] = "took";
        wordsArray[126][2] = "taken";
        wordsArray[126][3] = "BRAĆ";

        wordsArray[127][0] = "teach";
        wordsArray[127][1] = "taught";
        wordsArray[127][2] = "taught";
        wordsArray[127][3] = "UCZYĆ (KOGOŚ)";

        wordsArray[128][0] = "tear";
        wordsArray[128][1] = "tore";
        wordsArray[128][2] = "torn";
        wordsArray[128][3] = "DRZEĆ, ROZDZIERAĆ";

        wordsArray[129][0] = "tell";
        wordsArray[129][1] = "told";
        wordsArray[129][2] = "told";
        wordsArray[129][3] = "MÓWIĆ (KOMUŚ)";

        wordsArray[130][0] = "think";
        wordsArray[130][1] = "thought";
        wordsArray[130][2] = "thought";
        wordsArray[130][3] = "MYŚLEĆ";

        wordsArray[131][0] = "throw";
        wordsArray[131][1] = "threw";
        wordsArray[131][2] = "thrown";
        wordsArray[131][3] = "RZUCAĆ";

        wordsArray[132][0] = "tread";
        wordsArray[132][1] = "trod";
        wordsArray[132][2] = "trodden";
        wordsArray[132][3] = "KROCZYĆ, STĄPAĆ";

        wordsArray[133][0] = "wake";
        wordsArray[133][1] = "woke";
        wordsArray[133][2] = "woken";
        wordsArray[133][3] = "BUDZIĆ";

        wordsArray[134][0] = "wear";
        wordsArray[134][1] = "wore";
        wordsArray[134][2] = "worn";
        wordsArray[134][3] = "NOSIĆ, UBIERAC COŚ";

        wordsArray[135][0] = "weep";
        wordsArray[135][1] = "wept";
        wordsArray[135][2] = "wept";
        wordsArray[135][3] = "PŁAKAĆ, SZLOCHAĆ";

        wordsArray[136][0] = "understand";
        wordsArray[136][1] = "understood";
        wordsArray[136][2] = "understood";
        wordsArray[136][3] = "ROZUMIEĆ";

        wordsArray[137][0] = "win";
        wordsArray[137][1] = "won";
        wordsArray[137][2] = "won";
        wordsArray[137][3] = "WYGRYWAĆ";

        wordsArray[138][0] = "wind";
        wordsArray[138][1] = "wound";
        wordsArray[138][2] = "wound";
        wordsArray[138][3] = "NAWIJAĆ, NAKRĘECAĆ, WIĆ SIĘ";

        wordsArray[139][0] = "wring";
        wordsArray[139][1] = "wrung";
        wordsArray[139][2] = "wrung";
        wordsArray[139][3] = "WYKRECIĆ, WYŻĄĆ COŚ, WYCISNĄĆ";

        wordsArray[140][0] = "write";
        wordsArray[140][1] = "wrote";
        wordsArray[140][2] = "written";
        wordsArray[140][3] = "PISAĆ, NAPISAĆ";

        return wordsArray;
    }

    public static List<IrregularVerbTranslation> getIrregularVerbsAsList() {
        List<IrregularVerbTranslation> irregularVerbTranslationsList = new LinkedList<>();
        String[][] wordsArray = fillWords();

        for (int i = 0; i < wordsArray.length; i++) {
            IrregularVerbTranslation verb = new IrregularVerbTranslation();
            verb.setId(i + 1);
            verb.setIFrom(wordsArray[i][0]);
            verb.setIIForm(wordsArray[i][1]);
            verb.setIIIForm(wordsArray[i][2]);
            verb.setTranslation(wordsArray[i][3].toUpperCase());
            irregularVerbTranslationsList.add(verb);
        }
        return irregularVerbTranslationsList;
    }
}
