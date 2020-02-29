package com.example.listtim;

import java.util.ArrayList;

public class TimData {
    private static String[] namatim = new String[]{"BIGETRON", "RRQ", "ONIC", "EVOS", "AURA", "WAW", "AEROWOLF", "ALTER EGO"};
    private static int[] logotim = new
            int[]{R.drawable.bigetron, R.drawable.rrq,
            R.drawable.onic, R.drawable.evos, R.drawable.aura,
            R.drawable.waw, R.drawable.aero, R.drawable.alterego};
    private static String[] deskripsitim = new String[]{
            //Bigetron
            "Bigetron eSport merupakan salah satu organisasi esports yang paling sukses di Indonesia. Kemampuan mereka dalam bertanding di turnamen esports tidak dapat dipandang sebelah mata. Hal ini dbuktikan lewat sederet prestasi yang sudah mereka dapatkan sejak terbentuk pada tahun 2017.\n" +
                    "\n" +
                    "Memulai karirnya lewat League of Legends, sekarang Bigtron sudah mempunyai divisi yang tersebar di hampir semua game esports terkenal di dalam negeri. Mereka bahkan mengklaim diri sebagai organisasi esports dengan perkembangan paling pesat di Indonesia. Well, tentunya klaim ini didasari oleh alasan yang sangat mendukung.\n" +
                    "Tim eSports Indonesia Bigetron Red Alien juara dunia Turnamen PUBG Mobile PMCO Fall Split 2019 di Malaysia.\n" +
                    "\n" +
                    "Meski masih menyisakan tiga match, jarak poin yang dimiliki BTR RA terpaut jauh dengan penghuni peringkat dua yaitu Illuminate.\n" +
                    "\n" +
                    "Bigerton Red Alien berhasil mengumpulkan 273 dan disusul Illuminate dengan 148 poin.\n",

            //RRQ
            "Rex Regum Qeon (RRQ) bukanlah nama asing dalam dunia olahraga e-Sports. Tim besutan Adrian Pauline ini adalah salah satu tim e-Sports tangguh yang kerap menghiasi podium juara di beberapa kompetisi.\n" +
                    "\n" +
                    "Rex Regum dalam nama RRQ sendiri merupakan bahasa latin yang berarti King of Kings, atau raja segala raja. Sementara Qeon adalah nama salah satu game publisher di Indonesia, Qeon Interactive. Nama publisher itu memang sengaja disisipkan ke nama tim karena pada dasarnya RRQ merupakan tim e-Sports yang dibentuk oleh perusahaan tersebut.\n" +
                    "\n" +
                    "“Awalnya terbentuk tahun 2013. Saat itu cuman punya satu divisi saja, yakni Dota 2. Tahun 2017 lalu merambah ke game lain, yakni FIFA, PUBG, Mobile Legends, Point Blank, AOV, CSGO, dan PUBG Mobile,” tutur Adrian.\n" +
                    "\n" +
                    "Adrian mengaku, pamor timnya makin berkibar saat Mobile Legends muncul dan menjadi game yang digandrungi masyarakat.\n" +
                    "\n" +
                    "“Jadi awal mula makin berkembang dari Mobile Legends. Dari sana, akhirnya berpengaruh ke game yang lain juga. Semua juga mengakui Mobile Legends adalah game dengan penonton yang paling banyak saat ini,” ucapnya.\n" +
                    "\n" +
                    "Setelah sukses berkembang di Tanah Air, RRQ mulai melakukan ekspansi ke luar negeri. Mereka mulai merekrut pemain-pemain asing untuk bergabung sebagai skuad.\n" +
                    "\n" +
                    "Usaha mereka melebarkan sayap tidak sia-sia. Pada skuad divisi CSGO dan AOV, atlet-atlet RRQ tidak hanya berasal dari Indonesia saja. Beberapa diantaranya ada yang berasal dari negara lain, seperti Mongolia (Enkhtaivan Lkhagva) dan Filipina (Kevin Te).\n" +
                    "\n" +
                    "Bahkan dalam squad AOV, tim RRQ sendiri memiliki dua tim yang berbeda. Satu tim berisi pemain Indonesia, sementara tim lainnya diisi oleh para pemain Thailand.\n" +
                    "\n" +
                    "Layaknya tim e-Sports dan klub di cabang olahraga lain, RRQ juga punya standar tinggi dalam melakukan perekrutan anggota. Adrian mengatakan, setidaknya ada tiga syarat mutlak yang harus terpenuhi. “Pertama jelas harus jago. Kedua harus jaga karakter dan punya attitude, dan ketiga harus ada izin dari orang tua (jika masih pelajar, Red),” ungkap Adrian.\n" +
                    "\n" +
                    "Terkait proses dan waktu latihan, Adrian mengatakan bahwa RRQ sebetulnya tidak mewajibkan setiap atletnya untuk bermain game dalam waktu lama. Menurut Adrian, yang terpenting bukan memforsir latihan dalam waktu yang lama. Para atlet RRQ hanya perlu bermain secara rutin layaknya bekerja.\n" +
                    "\n" +
                    "“Di RRQ nggak harus begitu (main terus-menerus, Red). Ada jadwalnya. Kadang-kadang kan harus datang ke acara sponsor. Mereka juga harus live streaming, dan jumpa fans. Jadi nggak ada itu main terus menerus. Latihan cukup seperti orang kerja. Setiap hari delapan jam, dan libur dua hari dalam seminggu,” tutup Adrian.\n" +
                    "\n" +
                    "Sudah berjalan selama enam tahun, RRQ sudah mengoleksi sederet gelar membanggakan di level Asia. Dari segudang prestasi yang mereka cetak, rasanya pantas jika menyebut RRQ sebagai salah satu tim e-Sports paling digdaya di Indonesia.\n" +
                    "\n" +
                    "Berikut sebagian kecil prestasi yang pernah diraih tim RRQ di setiap nomornya:\n" +
                    "\n" +
                    "Divisi Dota 2\n" +
                    "1. Juara kedua Indonesia Pride Weekday Challenge 3nd Series.\n" +
                    "2. Juara kedua Dota 2 Celebration Cup\n" +
                    "3. Juara pertama Weekday Tournament Qualifier 2 by Revival\n" +
                    "4. Juara pertama GESC Indonesia Dota 2 Minor- Indonesia Qualifier.\n" +
                    "5. Juara ketiga Asia Pacific Predator Leaguage-Indonesia Pro Qualifier.\n" +
                    "\n" +
                    "Divisi Mobile Legend\n" +
                    "1. Juara kedua Straits Championship\n" +
                    "2. Juara pertama Mobile Star Leaguage Season 2.\n" +
                    "3. Juara pertama Mobile Legend Profesional leaguage Season 2\n" +
                    "4. Juara 1 MEC Showdonw Profesional Bracket 2018\n" +
                    "5. Juara 1 Mobile Legend Celebration Cup 2018\n" +
                    "\n" +
                    "Divisi Point Blank\n" +
                    "1. Juara ketiga Indonesia eSport Games 2018\n" +
                    "2. Juara satu Liga IESPL TBOF\n" +
                    "3. Juara kedua Point Blank International Championship 2018\n" +
                    "4. Juara kedua Point Blank Invitational Leaguage 2 2018\n" +
                    "5. Juara satu Point Blank 2 Series Indonesia Pride Weekday.\n" +
                    "\n" +
                    "Divisi PUBG Mobile\n" +
                    "1. Juara 1 Indonesia Tournament Center\n" +
                    "2. Juara 3 Zeus Gaming Tournament\n" +
                    "3. Juara 2 Kupang Championship\n" +
                    "4. Juara 1 Kupang Championship Kage\n" +
                    "5. Juara 1 Panick Tournament\n" +
                    "\n" +
                    "Divisi PUBG\n" +
                    "1. Juara 3 PUBG 2 series Indonesia Pride Weekday Championship\n" +
                    "2. Participant PUBG SEA Championship 2\n" +
                    "3. Juara 3 PUBG Southeast Cyber Arena Championship\n" +
                    "4. Juara 1 Ghost Alliance Squad Cup. season 1\n" +
                    "5. Juara 2 Final IEC Kratingdaeng ICE BSD\n" +
                    "\n" +
                    "Divisi FIFA\n" +
                    "1. Juara 2 ESL Asia Online Cup\n" +
                    "2. Juara 3 FIFA 18 Gamestart AFA\n" +
                    "3. Juara 1 Qualifier Asian Online Cup 3.\n" +
                    "4. Juara 1 Qualifier AFGC\n" +
                    "5. Juara 1 Qualifier FIFA 18 e-World Cup Championship\n" +
                    "\n" +
                    "Divisi AOV\n" +
                    "1. Juara 2 Indonesia Games Championship\n" +
                    "2. Juara 1 AOV Tournamen Tour Surabaya\n" +
                    "3. Juara 1 Mo-Cup 2\n" +
                    "4. Juara 3 Vo-Cup 3\n" +
                    "5. Juara 2 Vo-Cup 4\n" +
                    "\n" +
                    "Divisi CSGO\n" +
                    "1. Juara 2 Indonesia eSport Games 2018",
            //Onic
            "ONIC Esports is a Professional e-Sports Management Team founded in 26th July 2018.\n" +
                    "ONIC was built in belief where we see the future of entertainment is e-sports.\n" +
                    "E-sports scene in Indonesia is only at its early stage, and ONIC is here to step up the game with the spirit to be the best e-sports organisation in South East Asia. We manage talents and treat them like our own family and the best of all, make them shine with the best version of their self.\n" +
                    "More than just an e-sports industry, we also aim to become an inspiring organization that gives impact to the society and also motivate the youth to have the spirit like ours to achieve their dreams.\n" +
                    "\n" +
                    "VISION\n" +
                    "To be the highest benchmark in e-sports industry in South East Asia.\n" +
                    "\n" +
                    "MISSION\n" +
                    "Create the best environment possible for professional players to excel and compete on an international level.\n" +
                    "Manage our talents in the most suitable way to develop their best part of their self.\n" +
                    "Giving breakthrough campaign for the society that gives a positive impact.",
            //Evos
            "Kejuaraan dunia Mobile Legends M1 Bang Bang World Championship 2019 yang diselenggarakan di Axiata Arena, Kuala Lumpur, Malaysia, berhasil dimenangi oleh tim asal Indonesia, Evos Legends. Keberhasilan tersebut dicapai seusai Evos Legends mengalahkan sesama tim esports Indonesia lainnya, yakni Req Requm Qeon (RRQ), dengan skor tipis 4-3 pada partai grand final best of seven.\n" +
                    "\n" +
                    "Hal ini membuktikan bahwa Indonesia menguasai turnamen Mobile Legends Bang Bang. Perjalanan tim esports Evos Legends untuk meraih juara dunia di Mobile Legends M1 Bang Bang World Championship ini dimulai ketika mereka berhasil menguasai puncak klasemen fase grup. Setelah lolos dari fase grup, tim esports Evo Legends menghadapi tim asal Myanmar, Burmese Ghouls, dengan meraih kemenangan dengan skor 2-0. Pada pertandingan selanjutnya tim esports, Evos Legends bertemu dengan sesama perwakilan Indonesia lainnya dalam babak semifinal, Req Requm Qeon (RRQ). Evos Legends meraih kemenangan skor 3-0 pada Sabtu (16/11/2019).\n" +
                    "\n" +
                    "Pada partai grand final yang dihelat di Axiata Arena itu, Evos Legends bertemu kembali dengan Req Requm Qeon (RRQ). RRQ ke partai puncak karena berhasil mengalahkan tim esports asal Malaysia, Todak, di final lower bracket dengan skor 3-1. Evos Legends dan Req Requm Qeon (RRQ) merupakan dua perwakilan Indonesia yang berhasil melaju sampai grand final M1 World Championship. Hal ini pun membuktikan kekuatan Merah Putih dalam sebuah turnamen Mobile Legends Bang Bang.\n",
            //Aura
            "Seiring dengan booming industri esports, tak heran jika ada banyak orang yang ingin turut terjun ke dalamnya. Membuat organisasi esports menjadi salah satu pilihan bisnis yang bisa dilakukan. Kalau dibandingkan dengan olahraga tradisional, memiliki organisasi esports ini mirip seperti memiliki sebuah klub sepakbola.\n" +
                    "\n" +
                    "Setelah cerita sukses RRQ dan EVOS di Indonesia, ditambah dengan Mobile Legends, PUBG Mobile, dan Free Fire yang membuat gaming jadi mainstream, membuat banyak pihak jadi semakin tertarik bersaing menjadi organisasi esports terbesar di Indonesia. Salah satu dari mereka adalah, Aura Esports.\n" +
                    "\n" +
                    "Selasa kemarin (30 Juli 2019), Aura Esports baru saja mengadakan gelaran jumpa fans di Starium CGV Grand Indonesia, dengan divisi Free Fire. Ini adalah gelaran meet and greet pertama Aura Esports, namun ternyata gelaran ini sudah cukup ditunggu-tunggu, dan dihadiri oleh ratusan penggemar yang tak sabar bertemu sang idola.\n" +
                    "\n" +
                    "Namun, disela-sela riuh rendah para penggemar yang bertemu sang idola, acara ini juga dihadiri oleh Daniel, co-founder serta Chief Marketing Officer Aura Esports, serta Christopher Djaja, co-founder yang saat ini menjabat sebagai Chief Executive Officer (CEO).\n" +
                    "\n" +
                    "Dalam sebuah sesi wawancara, tim redaksi Hybrid bicara banyak hal dengan Christopher, salah satunya adalah soal latar belakang bisnis sang co-founder. Kalau Anda membaca wawancara kami dengan CEO RRQ, Andrian Pauline, Anda tentu sudah tahu, bahwa tim RRQ merupakan bagian dari bisnis MidPlaza Holding.\n" +
                    "\n" +
                    "Lalu bagaimana dengan Aura Esports? Christopher Djaja, sebelum terjun ke esports, memang sempat punya beberapa pengalaman bisnis. “Saya memang punya startup background. Pernah mencoba bisnis di bidang F&B, advokasi, dan lain sebagainya. Jadi, hasil dan pengalaman bisnis sebelumnya yang sudah terkumpul kami gunakan untuk membangun Aura Esports.” ujar Christopher.\n" +
                    "\n" +
                    "Lebih lanjut membahas latar belakang, Christopher juga secara singkat menjelaskan soal latar belakang keluarganya yang juga menyokong bisnis Aura Esports. “Kami sendiri juga mendapat dukungan dari bisnis keluarga, yaitu Wicaksana Group, yang adalah pelaku bisnis di bidang distribusi dan PT. Jakarana Tama, merupakan bisnis terbesar ketiga dalam bidang mi instan serta makanan kalengan.” Ucap Christopher menjelaskan.",
            //Waw
            "Kejutan tak henti-hentinya diberikan oleh Reza Arap Oktovian setelah dirinya menutup akun Youtube-nya awal bulan ini.  Beragam desas-desus pun ditujukan kepada Reza Arap mengenai alasannya menutup akun Youtube dengan subsribers 2,3 juta tersebut. Mulai dari gosip permasalahan dengan komunitas Youtube dan lainnya, namun Reza Arap berhasil menepis semua gosip tersebut. \n" +
                    "\n" +
                    "Reza mengungkapkan alasan dirinya berhenti dari Youtube adalah karena ingin fokus ke hal lainnya, mulai dari bisnis, karir musik, hingga manajemen eSports yang menjadi mimpinya. Kemudian, baru saja dua hari lalu, Reza Arap mengembalikan kembali akun Youtube-nya,namun bukan untuk dipakai pribadi, melainkan diperuntukkan bagi Yayasan Anyo Indonesia. \n" +
                    "Reza Arap mencertikan tentang mimpinya untuk memiliki tim dan manajemen eSports sejak tahun 2008. Dirinya mengatakan telah bermain DOTA sejak tahun 2003 sebagai pro player dan bahkan pernah mengikuti World Cyber Games sejak 2005-2009. Timnya Ombak Net berhasil menembus babak semifinal di Mal Taman Anggrek namun gagal untuk melaju ke partai final. Timnya juga termasuk 8 tim terbaik di Indonesia pada tahun 2008, sebelum akhirnya Reza Arap mengundurkan diri sebagai pro player di tahun 2009. \n" +
                    "\n" +
                    "Sekarang, 9 tahun setelah pensiun sebagai professional gamer, Reza Arap kembali ke dunia eSports namun sebagai Co-Owner dari tim eSports dan manajemen We Against The World. Logo burung hantu yang dipilih untuk timnya ini diakui karena memiliki makna Calmness, Integrity, and Silent Fighter.\n" ,

            //Aerowolf
            "Guyonan di awal bulan ternyata jadi kenyataan, meski tidak pada divisi yang dikabarkan ya. Resmi sudah, Kaesang Pangarep jadi pemain ke-10 di Genflix Aerowolf!\n" +
                    "\n" +
                    "Hal ini terungkap pada konferensi pers 'Ternakopi x Genflix Aerowolf', Jumat (16/8), di Multivision Tower, Jakarta Pusat. Alasan utama perekrutan dari Sang Infrastruktur Senam ini adalah upaya Genflix Aerowolf untuk tidak sekedar merekrut pemain baru saja, namun juga sosok mitra dalam memperkenalkan apa sesungguhnya ESPORTS kepada masyarakat luas.\n" +
                    "\n" +
                    "\"Genflix Aerowolf punya visi besar memajukan industri esports di tanah air. Tentunya, kami mau tim bisa menang turnamen gim sampai ke level dunia, tetapi visinya lebih dari itu. Kami ingin esports tumbuh dengan melibatkan semua orang yang passionate pada industri ini,\" tandas Hutama Pastika, selaku Head of Esports Development di Genflix Aerowolf, via rilis pers.\n" +
                    "\n" +
                    "Pemilihan Kaesang Pangarep, masih menurut Tommy (panggilan akrab Hutama), bukan semata karena beliau adalah putra bungsu Presiden RI, Joko Widodo, namun lebih bermuara pada sosok dirinya sebagai seorang gamer sejati dengan hasrat besar di ranah esports.\n" +
                    "\n" +
                    "Tidak hanya dikenal sebagai pemilik Ternakopi - Kopi Terenak, Kaesang Pangarep juga merupakan pengusaha sukses yang mengepalai banyak bidang usaha. Bahkan, di sela-sela kesibukannya, dia masih aktif bikin konten video blog dan rutin jalani profesi gaming video creator.\n" +
                    "\n" +
                    "\"Genflix Aerowolf yang meminang saya,\" kelakar Kaesang Pangarep, menanggapi kesannya terpilih sebagai pemain ke-10 di Genflix Aerowolf. \"Dari dulu itu, saya maen gim..walaupun gak jago. Jadi, sangat bangga ketika ada tim pro yang mau mengajak saya gabung.\"\n" +
                    "\n" +
                    "Selain torehan prestasi, Genflix Aerowolf meyakini bahwa kehadiran Kaesang yang memiliki ragam aktivitas kekinian dan produktif bisa menjadi duta penting esports di Indonesia. Bagaimana memberikan gambaran seperti apa sisi positif esports tersebut, dan cara menekuninya tanpa mengorbankan kegiatan sehari-hari lainnya.\n" +
                    "\n" +
                    "Genflix Aerowolf adalah tim esports profesional tanah air yang tanding di Liga Franchise Esports pertama untuk divisi Mobile Legends: Bang Bang Professional League. Berada di posisi 2 musim lalu, tim Genflix Aerowolf siap untuk memenangkannya musim ini.\n" +
                    "\n" +
                    "Cikal Bakal Genflix - Aerowolf\n" +
                    "Sejak awal memakai nama Aerowolf Pro Team, kini dengan kehadiran Genflix, maka secara resmi mulai bulan Mei silam organisasi esports ini pun beralih dengan brand Genflix Aerowolf!\n" +
                    "\n" +
                    "Alasan utamanya adalah tersedianya wahana penayangan perjuangan para gamer yang bernaung di bawah Genflix Aerowolf dalam ajang waralaba paling bergengsi di Indonesia, Mobile Legends franchise league.\n" +
                    "\n" +
                    "\"Hadirnya Genflix sebagai partner kami akan sangat membantu peningkatan exposure dari segi konten, dan brand,\" ujar Iwan Iman, Presiden Direktur Aerowolf. \"Platform ini juga menjadi wadah kami dalam membagikan pengalaman dunia esports ke khalayak banyak.\"\n" +
                    "\n" +
                    "Esports di Indonesia tumbuh pesat beberapa tahun belakangan, bahkan hingga ke ajang olahraga multievent seperti Asian Games 2018, di mana kita mampu meraih medali emas.\n" +
                    "\n" +
                    "\"Esports menjadi fenomena baru di kalangan milenials. Kami dan Genflix berharap dapat hadir di sebuah platform media yang sejalan dengan kebutuhan mereka,\" tambah Iwan Iman.\n" +
                    "\n" +
                    "Dalam kesempatan sama, di acara konferensi pers 'Ternakopi x Genflix Aerowolf', rekan-rekan media bakal menjajal skill mereka lawan skuad Mobile Legends dari Genflix Aerowolf, pada sesi Fun Match.",
            //Alterego
            "Nama Alter Ego mungkin sudah cukup lama malang melintang di dunia esports, tetapi sebagian dari Anda bisa jadi belum terlalu kenal dengan organisasi yang satu ini. Kali ini, Hybrid akan mencoba membahas tim yang satu ini. Namun, kita akan membahas Alter Ego dari sisi divisi Dota mereka yang sedang bertanding di ESL Indonesia Championship Season 2.\n" +
                    "\n" +
                    "Sebelum membahasnya lebih lanjut, mari kita lihat sepak terjang divisi Dota Alter Ego di ESL Indonesia Championship Season 2. Jika dibahas secara performa, tim ini adalah salah satu tim papan tengah yang cukup kuat.\n" +
                    "\n" +
                    "Saat ini, mereka menempati posisi ketiga dengan perolehan sebesar 27 poin, dan hanya terpaut 3 poin dari tim peringkat 2, EVOS Esports. Tim ini memiliki performa yang cukup stabil. Hasil-hasil pertandingan dari Alter Ego kerap kali sesuai dengan apa yang diharapkan.\n " +
                    "Performa stabil ini bisa dibilang didapatkan berkat kehadiran salah satu pemain senior di kancah kompetitif Dota, Farand “Koala” Kowara, ke dalam tim. Hal ini juga diakui sendiri oleh Ramzi “Ramz” Bayhaki, midlaner tim Dota Alter Ego.\n" +
                    "\n" +
                    "Menurutnya sosok Koala betul-betul seperti menjadi penengah bagi tim. Peran Koala saat ini sangat membantu kawan-kawan Alter Ego baik dari sisi in-game maupun out-game.\n" +
                    "\n" +
                    "“Dari out-game sendiri Koala banyak bantu ketika team meeting. Jadi sebelum bermain biasanya kita bahas strategi dan segala macam. Terus juga bantu memberi insight kalau lagi bahas replay segala macam. Kalau di luar teknis, Koala juga sering bantu menengahi tim kalau lagi konflik, menyemangati tim kalau lagi kalah. Hal-hal itu betul-betul sangat membantu bagi tim kami untuk berkembang lebih.” ujar Ramzi.\n" +
                    "\n" +
                    "Kendati demikian, bukan berarti Alter Ego sudah puas hanya dengan kehadiran Koala saja. “Buat roster yang sekarang, menurut saya hanya butuh waktu latihan yang cukup buat bersaing dengan tim-tim papan atas Indonesia, kurang lebih sih begitu.” Ramzi melanjutkan"
    };
    public static ArrayList<TimModel> getListTim() {
        TimModel timModel = null;
        ArrayList<TimModel> listtim = new ArrayList<>();
        for (int i = 0; i < namatim.length; i++) {
            timModel = new TimModel();
            timModel.setLogoTim(logotim[i]);
            timModel.setNamaTim(namatim[i]);
            timModel.setDeskripsi(deskripsitim[i]);
            listtim.add(timModel);
        }
        return listtim;
    }
}
