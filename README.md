
  <h1>Rendszerfejlesztés 2020.11.20.</h1>
  
  Bemutatjuk a GIT verziókezelő rendszer néhány alapműveletét.
  <br>
  Úgy mint:
  <ul>
   <li>A repository chekoutolása (clone)</li>
   <li>Új tsrtalom rögzítése (commit) </li>
   <li>Új fejlesztési ág (branch) létrehozása</li>
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

  <h2>Új fejlesztési ág (brench) létrehozása</h2>
  <h3>Készítette: Györgyi Gyula</h3>
  
  Alább bemutatjuk, hogy a NetBeans segítségével, hogyan lehet egy új független szálat létrheozni (brench).
  
  <ol>
      <li>
          Első lépésben az ablak tetején válasszuk a <b>Team -> Branch/Tag -> Create branch</b> opciót
      </li>
      <li>
          A felugró ablakban adjuk meg az új branch nevét. A többit hagyjuk változatlanul
          <br>
          <b>Megjegyzés:</b>Az új branchet automatikusan chekoputolja, ha nem vesszük ki a jelölőnégyzetet.
          <br>
          Majd kapcsoljunk a <b>Create</b> gombra
          <br>
          <img src="képek/ujbranch.png" alt="Új branch létrehozása"/>
      </li>
      <li>
          Ekkor létrejön a branch a helyi repoban és szerkeszthetjük.
          <br>
          Commitolás után a távoli szerveren is megjelenik.
          <br>
          <img src="képek/<br>" alt="Az új branch a repoban"/>
      </li>

  </ol>

  
  
  <b>Készítették:</b> Fűkő Erik, Boros Máté, Györgyi Gyula
 