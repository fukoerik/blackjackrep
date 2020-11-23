
  <h1>Rendszerfejlesztés 2020.11.20.</h1>
  
  Bemutatjuk a GIT verziókezelő rendszer néhány alapműveletét.
  <br>
  Úgy mint:
  <ul>
   <li>A repository chekoutolása (clone) (Györgyi Gyula)</li>
   <li>Új tartalom rögzítése (commit) (Boros Máté, Fűkő Erik)</li>
   <li>Új fejlesztési ág (branch) létrehozása (Györgyi Gyula)</li>
   <li>Az új branch-ben történt változtatások ellenőrzése (pull request) </li>
   <li>Az elfogadott változtatások rögzítése és beolvasztása a fő ágba (merge) </li>
  </ul>
  
  <h2>A repository chekoutolása (clone)</h2>
  <h3>Készítette: Györgyi Gyula</h3>
  A távoli repository tartalmának szerkesztéséhez szükség van egy helyi másolat készítésére.
  <br>
  Ezt chekoutnak vagy clone nak nevezik.
  <br>
  NetBeans-ben ezt a következő képpen lehet megtenni:
  <ol>
      <li>A fenti menüsorban keressük ki a <b>Team -> Git -> Clone</b>  lehetőséget 
          <br>
          <img src ="képek/clone.png">
      </li>
      <li>A felugró ablakban töltsük ki az üres mezőket: 
          <br>
          a repo url-je (hol található az interneten), 
          <br>
          A távoli tárolón használt felhasználónév valamint jelszó
          <br>
          Valamint a az a helyi mappa, ahová letölti a repo tartalmát NetBeans.
      </li>
      <li>Majd kapcsoljunk a <b>Next</b> gombra </li>
      <li>
          Itt megkérdezi, hogy melyik távoli branch-eket szeretnénk szerkeszteni, letölteni. Jelöljük ki amelyikre szükségünk van.
          <br>
          <img src="képek/távoli_brench.png">
      </li>
      <li> Ismét kapcsoljunk a <b>Next</b> gombra </li>
      <li>
          Végül a lemásolt repo helyéről és a másolás után szerkesztendő branch-ről tesz fel kérdésst.
          <br>
          <img src="képek/utolso.png">
          A jelölőnégyzetet vegyük ki, majd kapcsoljunk a <b>Finish</b> gombra
      </li>   
      <li>
          Ekkor elkezdi letölteni a repo tartalmát a megadottak szerint, ha végzett szerkeszthetjük.
          <img src="képek/clone_folyamatban.png" />
      </li>
  </ol>
 <!----------------------------------------------------------------------------> 
    <h2>Új tartalom hozzáadása</h2>
    <ol>
        <li>
            Elsőnek commitoltam a gépemen lévő repoba.(Boros Máté)
            <br>
            <img src="képek/bm1.png" >
        </li>
        <li>
            Az után a projektre jobb gombal majd aztán a git nevezetű menüpontba a push-t használva feltöltöttem ide.(Boros Máté)
            <br>
            <img src="képek/bm2.png" >
        </li>
        <li>
            Elsőnek commitoltam a gépemen lévő repoba. (Boros Máté)
            <br>
            <img src="képek/bm1.png" >
        </li>
        <li>
            Új fájl hozzáadása a repository-hoz (Fűkő Erik)
            <br>
            <img src="képek/commit_e.PNG" >
        </li>
  </ol>
   <!----------------------------------------------------------------------------> 

  
  <h2>Fejlesztési ágak összeolvasztása</h2>
  
  <ol>
    <li>
        Merge (Fűkő Erik)
        <br>
        <img src="képek/merge_e.PNG" />
    </li>
    
    <li>
        <img src="képek/merge_e2.png" />
    </li>
  </ol>
  
  <h2>A helyi változtartások feltöltése a távoli repoba</h2>
  
  <ol>
    <li>
      Pull (Fűkő Erik)
      <br>
      <img src="képek/pull_e.PNG" />
    </li>
  </ol>
  <b>Készítették:</b> Fűkő Erik, Boros Máté, Györgyi Gyula
 
