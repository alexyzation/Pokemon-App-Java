package com.pokedex.data;

import com.pokedex.model.*;
import com.pokedex.util.TypeEffectivenessCalculator;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
public class PokemonDataInitializer {

    public List<Pokemon> initializePokemonList() {
        return Arrays.asList(
                // Todos os 151 Pokémon da primeira geração com dados regionais, descrições e efetividades
                createPokemon(1, "Bulbasaur", "Um Pokémon do tipo Grama/Veneno. Há uma semente nas costas desde o nascimento.", 
                    Arrays.asList(PokemonType.GRASS, PokemonType.POISON), Region.KANTO, 
                    Arrays.asList(new RegionalEntry(Region.KANTO, 1), new RegionalEntry(Region.JOHTO, 226))),
                    
                createPokemon(2, "Ivysaur", "Quando o bulbo nas costas cresce, parece perder a capacidade de ficar de pé nas patas traseiras.", 
                    Arrays.asList(PokemonType.GRASS, PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 2), new RegionalEntry(Region.JOHTO, 227))),
                    
                createPokemon(3, "Venusaur", "A planta nas costas libera um aroma doce que intensifica as emoções.", 
                    Arrays.asList(PokemonType.GRASS, PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 3), new RegionalEntry(Region.JOHTO, 228))),
                    
                createPokemon(4, "Charmander", "Prefere coisas quentes. Quando chove, diz-se que vapor sai da ponta da cauda.", 
                    Arrays.asList(PokemonType.FIRE), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 4), new RegionalEntry(Region.JOHTO, 229))),
                    
                createPokemon(5, "Charmeleon", "Quando balança sua cauda ardente, eleva gradualmente a temperatura ao redor.", 
                    Arrays.asList(PokemonType.FIRE), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 5), new RegionalEntry(Region.JOHTO, 230))),
                    
                createPokemon(6, "Charizard", "Voa pelo céu em busca de oponentes poderosos. Cospe fogo tão quente que derrete quase tudo.", 
                    Arrays.asList(PokemonType.FIRE, PokemonType.FLYING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 6), new RegionalEntry(Region.JOHTO, 231))),
                    
                createPokemon(7, "Squirtle", "Após o nascimento, suas costas incham e endurecem formando um casco.", 
                    Arrays.asList(PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 7), new RegionalEntry(Region.JOHTO, 232))),
                    
                createPokemon(8, "Wartortle", "É reconhecido como símbolo de longevidade. Se o casco for coberto de algas, este Pokémon é muito velho.", 
                    Arrays.asList(PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 8), new RegionalEntry(Region.JOHTO, 233))),
                    
                createPokemon(9, "Blastoise", "Um Pokémon brutal com canhões d'água pressurizada em seu casco. Eles são usados para ataques de alto impacto.", 
                    Arrays.asList(PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 9), new RegionalEntry(Region.JOHTO, 234))),
                    
                createPokemon(10, "Caterpie", "Suas pernas curtas têm ventosas que permitem subir em superfícies inclinadas sem escorregar.", 
                    Arrays.asList(PokemonType.BUG), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 10), new RegionalEntry(Region.JOHTO, 24))),
                    
                createPokemon(11, "Metapod", "Seu casco é resistente como ferro. Permanece imóvel para evoluir rapidamente.", 
                    Arrays.asList(PokemonType.BUG), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 11), new RegionalEntry(Region.JOHTO, 25))),
                    
                createPokemon(12, "Butterfree", "Adora o néctar das flores. Consegue localizar patches de flores que têm apenas um pouco de pólen.", 
                    Arrays.asList(PokemonType.BUG, PokemonType.FLYING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 12), new RegionalEntry(Region.JOHTO, 26))),
                    
                createPokemon(13, "Weedle", "Frequentemente encontrado em florestas, comendo folhas. Tem uma aguilhão venenoso na cabeça.", 
                    Arrays.asList(PokemonType.BUG, PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 13), new RegionalEntry(Region.JOHTO, 27))),
                    
                createPokemon(14, "Kakuna", "Quase incapaz de se mover, este Pokémon só consegue endurecer seu casco para se proteger de predadores.", 
                    Arrays.asList(PokemonType.BUG, PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 14), new RegionalEntry(Region.JOHTO, 28))),
                    
                createPokemon(15, "Beedrill", "Extremamente territorial. Voa em alta velocidade e ataca usando os grandes aguilhões venenosos em seus braços.", 
                    Arrays.asList(PokemonType.BUG, PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 15), new RegionalEntry(Region.JOHTO, 29))),
                    
                createPokemon(16, "Pidgey", "Um Pokémon dócil que prefere evitar conflitos. Se perturbado, levanta areia para se proteger.", 
                    Arrays.asList(PokemonType.NORMAL, PokemonType.FLYING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 16), new RegionalEntry(Region.JOHTO, 10))),
                    
                createPokemon(17, "Pidgeotto", "Muito territorial, este Pokémon defende ferozmente sua área de cerca de 100 km.", 
                    Arrays.asList(PokemonType.NORMAL, PokemonType.FLYING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 17), new RegionalEntry(Region.JOHTO, 11))),
                    
                createPokemon(18, "Pidgeot", "Quando está caçando, voa incrivelmente próximo à superfície da água e agarra presas desavisadas com suas garras.", 
                    Arrays.asList(PokemonType.NORMAL, PokemonType.FLYING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 18), new RegionalEntry(Region.JOHTO, 12))),
                    
                createPokemon(19, "Rattata", "Morde qualquer coisa quando ataca. Pequeno e muito rápido, é comumente visto em muitos lugares.", 
                    Arrays.asList(PokemonType.NORMAL), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 19), new RegionalEntry(Region.JOHTO, 17))),
                    
                createPokemon(20, "Raticate", "Usa seus bigodes para manter o equilíbrio. Parece ficar mais lento se eles são cortados.", 
                    Arrays.asList(PokemonType.NORMAL), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 20), new RegionalEntry(Region.JOHTO, 18))),
                    
                createPokemon(21, "Spearow", "Come insetos em áreas gramadas. Precisa bater as asas curtas muito rapidamente para permanecer no ar.", 
                    Arrays.asList(PokemonType.NORMAL, PokemonType.FLYING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 21), new RegionalEntry(Region.JOHTO, 13))),
                    
                createPokemon(22, "Fearow", "Com suas enormes e magníficas asas, pode continuar voando sem nunca precisar pousar para descanso.", 
                    Arrays.asList(PokemonType.NORMAL, PokemonType.FLYING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 22), new RegionalEntry(Region.JOHTO, 14))),
                    
                createPokemon(23, "Ekans", "Move-se silenciosamente e furtivamente. Come ovos de Pidgey e Spearow inteiros.", 
                    Arrays.asList(PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 23), new RegionalEntry(Region.JOHTO, 52))),
                    
                createPokemon(24, "Arbok", "Este Pokémon é terrivelmente forte para constritar coisas com seu corpo. Pode até mesmo achatar tambores de aço.", 
                    Arrays.asList(PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 24), new RegionalEntry(Region.JOHTO, 53))),
                    
                createPokemon(25, "Pikachu", "Quando vários destes Pokémon se reúnem, sua eletricidade pode provocar tempestades de raios.", 
                    Arrays.asList(PokemonType.ELECTRIC), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 25), new RegionalEntry(Region.JOHTO, 22))),
                    
                createPokemon(26, "Raichu", "Sua longa cauda serve como aterramento para proteger de sua própria alta voltagem.", 
                    Arrays.asList(PokemonType.ELECTRIC), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 26), new RegionalEntry(Region.JOHTO, 23))),
                    
                createPokemon(27, "Sandshrew", "Escava profundamente no subsolo em áreas áridas, longe da água. Emerge apenas para caçar alimento.", 
                    Arrays.asList(PokemonType.GROUND), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 27), new RegionalEntry(Region.JOHTO, 30))),
                    
                createPokemon(28, "Sandslash", "Enrola-se numa bola para se proteger de ataques. Também rola ladeira abaixo para escapar do perigo.", 
                    Arrays.asList(PokemonType.GROUND), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 28), new RegionalEntry(Region.JOHTO, 31))),
                    
                createPokemon(29, "Nidoran♀", "Embora pequeno, seus chifres venenosos são perigosos. Tem ouvidos maiores que os dos machos.", 
                    Arrays.asList(PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 29), new RegionalEntry(Region.JOHTO, 32))),
                    
                createPokemon(30, "Nidorina", "Quando está com seus filhotes e amigos, suas farpas retraem para não ferir ninguém acidentalmente.", 
                    Arrays.asList(PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 30), new RegionalEntry(Region.JOHTO, 33))),
                    
                createPokemon(31, "Nidoqueen", "Suas escamas rígidas e semelhantes a rochas protegem-no. É adepte em dar pancadas com sua cauda pesada.", 
                    Arrays.asList(PokemonType.POISON, PokemonType.GROUND), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 31), new RegionalEntry(Region.JOHTO, 34))),
                    
                createPokemon(32, "Nidoran♂", "Enrijece suas orelhas para sentir perigo. Quanto maiores os chifres, mais potente é o veneno.", 
                    Arrays.asList(PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 32), new RegionalEntry(Region.JOHTO, 35))),
                    
                createPokemon(33, "Nidorino", "Um Pokémon agressivo que está sempre procurando uma briga. Tem um chifre mais duro que diamante.", 
                    Arrays.asList(PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 33), new RegionalEntry(Region.JOHTO, 36))),
                    
                createPokemon(34, "Nidoking", "Usa sua cauda poderosa em batalha para esmagar, constritar e quebrar os ossos dos inimigos.", 
                    Arrays.asList(PokemonType.POISON, PokemonType.GROUND), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 34), new RegionalEntry(Region.JOHTO, 37))),
                    
                createPokemon(35, "Clefairy", "Sua aparência mágica e fofa faz com que seja altamente procurado como animal de estimação.", 
                    Arrays.asList(PokemonType.FAIRY), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 35), new RegionalEntry(Region.JOHTO, 39))),
                    
                createPokemon(36, "Clefable", "Um Pokémon tímido que raramente se mostra. Corre e se esconde no momento em que sente alguém se aproximando.", 
                    Arrays.asList(PokemonType.FAIRY), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 36), new RegionalEntry(Region.JOHTO, 40))),
                    
                createPokemon(37, "Vulpix", "Ao nascer, tem uma cauda branca que se divide em seis. Conforme cresce, suas caudas se tornam mais belas.", 
                    Arrays.asList(PokemonType.FIRE), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 37), new RegionalEntry(Region.JOHTO, 125))),
                    
                createPokemon(38, "Ninetales", "Muito inteligente e vingativo. Agarrar uma de suas caudas pode resultar numa maldição de 1000 anos.", 
                    Arrays.asList(PokemonType.FIRE), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 38), new RegionalEntry(Region.JOHTO, 126))),
                    
                createPokemon(39, "Jigglypuff", "Quando seus enormes olhos se iluminam, ele canta uma canção melodiosa que faz qualquer um adormecer.", 
                    Arrays.asList(PokemonType.NORMAL, PokemonType.FAIRY), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 39), new RegionalEntry(Region.JOHTO, 44))),
                    
                createPokemon(40, "Wigglytuff", "Seu corpo é macio e elástico. Quando irritado, suga ar e se infla enormemente.", 
                    Arrays.asList(PokemonType.NORMAL, PokemonType.FAIRY), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 40), new RegionalEntry(Region.JOHTO, 45))),
                    
                createPokemon(41, "Zubat", "Forma colônias em lugares escuros. Usa ondas ultrassônicas para identificar e se aproximar de alvos.", 
                    Arrays.asList(PokemonType.POISON, PokemonType.FLYING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 41), new RegionalEntry(Region.JOHTO, 37))),
                    
                createPokemon(42, "Golbat", "Tem uma vez que começou a sugar sangue, não para até estar cheio. Voa durante a noite em busca de pescoço frescos.", 
                    Arrays.asList(PokemonType.POISON, PokemonType.FLYING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 42), new RegionalEntry(Region.JOHTO, 38))),
                    
                createPokemon(43, "Oddish", "Durante o dia se enterra no solo. À noite, vaga em busca de um local mais adequado.", 
                    Arrays.asList(PokemonType.GRASS, PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 43), new RegionalEntry(Region.JOHTO, 24))),
                    
                createPokemon(44, "Gloom", "O fluido que vaza de sua boca não é baba. É um néctar usado para atrair presas.", 
                    Arrays.asList(PokemonType.GRASS, PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 44), new RegionalEntry(Region.JOHTO, 25))),
                    
                createPokemon(45, "Vileplume", "Quanto maiores as pétalas, mais tóxico é o pólen. Sua cabeça pesada faz com que oscile.", 
                    Arrays.asList(PokemonType.GRASS, PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 45), new RegionalEntry(Region.JOHTO, 26))),
                    
                createPokemon(46, "Paras", "Escava para comer raízes de árvores. Os cogumelos nas costas crescem com os nutrientes da árvore.", 
                    Arrays.asList(PokemonType.BUG, PokemonType.GRASS), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 46), new RegionalEntry(Region.JOHTO, 71))),
                    
                createPokemon(47, "Parasect", "Um parasita controlado pelos cogumelos maiores nas costas. Prefere lugares úmidos.", 
                    Arrays.asList(PokemonType.BUG, PokemonType.GRASS), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 47), new RegionalEntry(Region.JOHTO, 72))),
                    
                createPokemon(48, "Venonat", "Vive nas sombras de árvores altas onde come insetos. É atraído pela luz à noite.", 
                    Arrays.asList(PokemonType.BUG, PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 48), new RegionalEntry(Region.JOHTO, 108))),
                    
                createPokemon(49, "Venomoth", "As escamas em suas asas são venenosas. Se tocadas, causam paralisia e às vezes dor contínua.", 
                    Arrays.asList(PokemonType.BUG, PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 49), new RegionalEntry(Region.JOHTO, 109))),
                    
                createPokemon(50, "Diglett", "Vive cerca de um metro sob a terra onde se alimenta de raízes de plantas. Aparece ocasionalmente acima do solo.", 
                    Arrays.asList(PokemonType.GROUND), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 50), new RegionalEntry(Region.JOHTO, 132))),
                    
                createPokemon(51, "Dugtrio", "Um trio de Diglett. Pode cavar através da terra mais dura para profundidades de 100 km.", 
                    Arrays.asList(PokemonType.GROUND), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 51), new RegionalEntry(Region.JOHTO, 133))),
                    
                createPokemon(52, "Meowth", "Adora objetos redondos. Vaga pelas ruas todas as noites para procurar moedas perdidas.", 
                    Arrays.asList(PokemonType.NORMAL), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 52), new RegionalEntry(Region.JOHTO, 137))),
                    
                createPokemon(53, "Persian", "Tem seis farpas sensíveis perto de seu nariz. Usa-as para sentir mudanças no ar.", 
                    Arrays.asList(PokemonType.NORMAL), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 53), new RegionalEntry(Region.JOHTO, 138))),
                    
                createPokemon(54, "Psyduck", "Embora possua poderes formidáveis, nunca se lembra de tê-los usado.", 
                    Arrays.asList(PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 54), new RegionalEntry(Region.JOHTO, 138))),
                    
                createPokemon(55, "Golduck", "Frequentemente visto nadando elegantemente em lagos. É muitas vezes confundido com o lendário Kappa.", 
                    Arrays.asList(PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 55), new RegionalEntry(Region.JOHTO, 139))),
                    
                createPokemon(56, "Mankey", "Extremamente temperamental e agressivo. Pode ficar furioso facilmente e ataca qualquer um na proximidade.", 
                    Arrays.asList(PokemonType.FIGHTING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 56), new RegionalEntry(Region.JOHTO, 140))),
                    
                createPokemon(57, "Primeape", "Sempre furioso e tenaz. Perseguirá inimigos seja qual for a distância.", 
                    Arrays.asList(PokemonType.FIGHTING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 57), new RegionalEntry(Region.JOHTO, 141))),
                    
                createPokemon(58, "Growlithe", "Muito protetor de seu território. Latirá e morderá para repelir intrusos.", 
                    Arrays.asList(PokemonType.FIRE), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 58), new RegionalEntry(Region.JOHTO, 127))),
                    
                createPokemon(59, "Arcanine", "Um Pokémon lendário na China. Muitas pessoas são cativadas por sua beleza graciosa e corrida.", 
                    Arrays.asList(PokemonType.FIRE), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 59), new RegionalEntry(Region.JOHTO, 128))),
                    
                createPokemon(60, "Poliwag", "Suas pernas recém-desenvolvidas impedem-no de correr. Parece preferir nadar do que tentar correr.", 
                    Arrays.asList(PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 60), new RegionalEntry(Region.JOHTO, 71))),
                    
                createPokemon(61, "Poliwhirl", "Capaz de viver dentro ou fora da água. Quando fora da água, sua por constantemente para manter seu corpo escorregadio.", 
                    Arrays.asList(PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 61), new RegionalEntry(Region.JOHTO, 72))),
                    
                createPokemon(62, "Poliwrath", "Um hábil nadador tanto no peito quanto no nado livre. Vence facilmente os melhores nadadores humanos.", 
                    Arrays.asList(PokemonType.WATER, PokemonType.FIGHTING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 62), new RegionalEntry(Region.JOHTO, 73))),
                    
                createPokemon(63, "Abra", "Usando seus poderes psíquicos, pode sentir perigo iminente e se teletransportar para segurança.", 
                    Arrays.asList(PokemonType.PSYCHIC), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 63), new RegionalEntry(Region.JOHTO, 89))),
                    
                createPokemon(64, "Kadabra", "Emite ondas psíquicas especiais de seu corpo que fazem com que relógios próximos corram para trás.", 
                    Arrays.asList(PokemonType.PSYCHIC), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 64), new RegionalEntry(Region.JOHTO, 90))),
                    
                createPokemon(65, "Alakazam", "Seu cérebro nunca para de crescer, tornando sua cabeça muito pesada para suportar.", 
                    Arrays.asList(PokemonType.PSYCHIC), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 65), new RegionalEntry(Region.JOHTO, 91))),
                    
                createPokemon(66, "Machop", "Ama construir seus músculos. Treina em todos os tipos de artes marciais para se tornar ainda mais forte.", 
                    Arrays.asList(PokemonType.FIGHTING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 66), new RegionalEntry(Region.JOHTO, 140))),
                    
                createPokemon(67, "Machoke", "Seu corpo musculoso é tão poderoso que deve usar um cinto de energia para controlar seus movimentos.", 
                    Arrays.asList(PokemonType.FIGHTING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 67), new RegionalEntry(Region.JOHTO, 141))),
                    
                createPokemon(68, "Machamp", "Usando seus quatro braços, pode mover montanhas e realizar 1000 socos por segundo.", 
                    Arrays.asList(PokemonType.FIGHTING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 68), new RegionalEntry(Region.JOHTO, 142))),
                    
                createPokemon(69, "Bellsprout", "Prefere lugares quentes e úmidos. Captura pequenos insetos com suas vinhas para se alimentar.", 
                    Arrays.asList(PokemonType.GRASS, PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 69), new RegionalEntry(Region.JOHTO, 24))),
                    
                createPokemon(70, "Weepinbell", "Cospe um fluido que dissolve qualquer coisa. Quando com fome, engole qualquer coisa que se mova.", 
                    Arrays.asList(PokemonType.GRASS, PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 70), new RegionalEntry(Region.JOHTO, 25))),
                    
                createPokemon(71, "Victreebel", "Disse que vive em enormes colônias nas profundezas das selvas, mas ninguém jamais retornou de lá.", 
                    Arrays.asList(PokemonType.GRASS, PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 71), new RegionalEntry(Region.JOHTO, 26))),
                    
                createPokemon(72, "Tentacool", "Deriva nos mares tropicais superficiais. Fisga presas com seus tentáculos venenosos.", 
                    Arrays.asList(PokemonType.WATER, PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 72), new RegionalEntry(Region.JOHTO, 72))),
                    
                createPokemon(73, "Tentacruel", "Seus tentáculos se estendem quando caça. Podem ser estendidos livremente de seus 80 tentáculos.", 
                    Arrays.asList(PokemonType.WATER, PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 73), new RegionalEntry(Region.JOHTO, 73))),
                    
                createPokemon(74, "Geodude", "Encontrado em campos e montanhas. Confunde-se frequentemente com uma pequena rocha e pode ser pisado ou pego.", 
                    Arrays.asList(PokemonType.ROCK, PokemonType.GROUND), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 74), new RegionalEntry(Region.JOHTO, 34))),
                    
                createPokemon(75, "Graveler", "Rola por encostas de montanhas para se mover. Uma vez que começa a rolar, não parará até atingir terreno plano.", 
                    Arrays.asList(PokemonType.ROCK, PokemonType.GROUND), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 75), new RegionalEntry(Region.JOHTO, 35))),
                    
                createPokemon(76, "Golem", "Sua carapaça rochosa é extremamente dura. Pode facilmente suportar dinamite com arranhões apenas superficiais.", 
                    Arrays.asList(PokemonType.ROCK, PokemonType.GROUND), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 76), new RegionalEntry(Region.JOHTO, 36))),
                    
                createPokemon(77, "Ponyta", "Sua crina ardente cresce pouco após o nascimento. Pode galopar logo após o nascimento.", 
                    Arrays.asList(PokemonType.FIRE), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 77), new RegionalEntry(Region.JOHTO, 88))),
                    
                createPokemon(78, "Rapidash", "Muito competitivo, este Pokémon perseguirá qualquer coisa que se mova rapidamente na esperança de correr contra ela.", 
                    Arrays.asList(PokemonType.FIRE), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 78), new RegionalEntry(Region.JOHTO, 89))),
                    
                createPokemon(79, "Slowpoke", "Incrivelmente lento e burro. Demora 5 segundos para sentir dor quando atacado.", 
                    Arrays.asList(PokemonType.WATER, PokemonType.PSYCHIC), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 79), new RegionalEntry(Region.JOHTO, 79))),
                    
                createPokemon(80, "Slowbro", "O Shellder agarrado à cauda de Slowpoke libera toxinas que fazem seu hospedeiro ser mais esperto.", 
                    Arrays.asList(PokemonType.WATER, PokemonType.PSYCHIC), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 80), new RegionalEntry(Region.JOHTO, 80))),
                    
                createPokemon(81, "Magnemite", "Usa ondas anti-gravitacionais para se manter no ar. Ataca usando ondas eletromagnéticas.", 
                    Arrays.asList(PokemonType.ELECTRIC, PokemonType.STEEL), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 81), new RegionalEntry(Region.JOHTO, 81))),
                    
                createPokemon(82, "Magneton", "Formado por vários Magnemite ligados. Eles emitem frequentemente poderosas ondas magnéticas.", 
                    Arrays.asList(PokemonType.ELECTRIC, PokemonType.STEEL), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 82), new RegionalEntry(Region.JOHTO, 82))),
                    
                createPokemon(83, "Farfetch'd", "O alho-poró que carrega é sua arma. É arremessado como uma lança para derrubar presas.", 
                    Arrays.asList(PokemonType.NORMAL, PokemonType.FLYING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 83), new RegionalEntry(Region.JOHTO, 83))),
                    
                createPokemon(84, "Doduo", "Um Pokémon pássaro que não pode voar. Suas cabeças funcionam como dois cérebros separados.", 
                    Arrays.asList(PokemonType.NORMAL, PokemonType.FLYING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 84), new RegionalEntry(Region.JOHTO, 84))),
                    
                createPokemon(85, "Dodrio", "Usa suas três cabeças inteligentes para planejar estratégias complexas. Pode correr a 60 km/h.", 
                    Arrays.asList(PokemonType.NORMAL, PokemonType.FLYING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 85), new RegionalEntry(Region.JOHTO, 85))),
                    
                createPokemon(86, "Seel", "O chifre em sua cabeça é muito duro. Usa-o para romper camadas de gelo e navegar pela água.", 
                    Arrays.asList(PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 86), new RegionalEntry(Region.JOHTO, 86))),
                    
                createPokemon(87, "Dewgong", "Armazena energia térmica em seu corpo. Nada a uma velocidade estável mesmo em águas geladas.", 
                    Arrays.asList(PokemonType.WATER, PokemonType.ICE), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 87), new RegionalEntry(Region.JOHTO, 87))),
                    
                createPokemon(88, "Grimer", "Nasceu de lodo que foi exposto aos raios-X da lua. Prospera através da absorção de poluentes.", 
                    Arrays.asList(PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 88), new RegionalEntry(Region.JOHTO, 88))),
                    
                createPokemon(89, "Muk", "Extremamente venenoso, mesmo suas pegadas contêm veneno. Não faça crescer nada lá por 3 anos.", 
                    Arrays.asList(PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 89), new RegionalEntry(Region.JOHTO, 89))),
                    
                createPokemon(90, "Shellder", "Sua carapaça é mais dura que diamante. Dentro, porém, é surpreendentemente macia.", 
                    Arrays.asList(PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 90), new RegionalEntry(Region.JOHTO, 90))),
                    
                createPokemon(91, "Cloyster", "Quando atacado, lança suas conchas espinhosas em sucessão rápida. Ninguém jamais viu o que há dentro.", 
                    Arrays.asList(PokemonType.WATER, PokemonType.ICE), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 91), new RegionalEntry(Region.JOHTO, 91))),
                    
                createPokemon(92, "Gastly", "Quase invisível, este Pokémon gasoso arrebata vítimas desprevenidas e as sufoca em temperatura-zero.", 
                    Arrays.asList(PokemonType.GHOST, PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 92), new RegionalEntry(Region.JOHTO, 92))),
                    
                createPokemon(93, "Haunter", "Por causa de sua capacidade de deslizar através das paredes, diz-se que vem de outra dimensão.", 
                    Arrays.asList(PokemonType.GHOST, PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 93), new RegionalEntry(Region.JOHTO, 93))),
                    
                createPokemon(94, "Gengar", "Sob luz de lua completa, este Pokémon gosta de imitar as sombras das pessoas e troçar de seus medos.", 
                    Arrays.asList(PokemonType.GHOST, PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 94), new RegionalEntry(Region.JOHTO, 94))),
                    
                createPokemon(95, "Onix", "Conforme escava através do solo, absorve muitos objetos duros. Isso torna seu corpo muito sólido.", 
                    Arrays.asList(PokemonType.ROCK, PokemonType.GROUND), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 95), new RegionalEntry(Region.JOHTO, 95))),
                    
                createPokemon(96, "Drowzee", "Coloca inimigos para dormir e come seus sonhos. Ocasionalmente fica doente por comer pesadelos ruins.", 
                    Arrays.asList(PokemonType.PSYCHIC), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 96), new RegionalEntry(Region.JOHTO, 96))),
                    
                createPokemon(97, "Hypno", "Quando balança seu pêndulo, pode colocar inimigos em um estado de transe e fazer com que façam sua vontade.", 
                    Arrays.asList(PokemonType.PSYCHIC), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 97), new RegionalEntry(Region.JOHTO, 97))),
                    
                createPokemon(98, "Krabby", "Suas garras são não apenas poderosas armas, mas também são usadas para equilibrio quando andando de lado.", 
                    Arrays.asList(PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 98), new RegionalEntry(Region.JOHTO, 98))),
                    
                createPokemon(99, "Kingler", "Sua garra direita cresce grande. Se essa garra for perdida, nunca mais crescerá de volta.", 
                    Arrays.asList(PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 99), new RegionalEntry(Region.JOHTO, 99))),
                    
                createPokemon(100, "Voltorb", "Geralmente encontrado em usinas de energia. Facilmente confundido com uma Poké Ball, já causou muitos acidentes.", 
                    Arrays.asList(PokemonType.ELECTRIC), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 100), new RegionalEntry(Region.JOHTO, 100))),
                    
                createPokemon(101, "Electrode", "Armazena energia elétrica dentro de seu corpo. Mesmo o menor choque pode fazer com que exploda.", 
                    Arrays.asList(PokemonType.ELECTRIC), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 101), new RegionalEntry(Region.JOHTO, 101))),
                    
                createPokemon(102, "Exeggcute", "Este Pokémon consiste em seis ovos que se cuidam mutuamente. Os ovos se atraem e giram.", 
                    Arrays.asList(PokemonType.GRASS, PokemonType.PSYCHIC), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 102), new RegionalEntry(Region.JOHTO, 102))),
                    
                createPokemon(103, "Exeggutor", "Lenda tem que em raras ocasiões, uma de suas cabeças cai para se tornar um Exeggcute.", 
                    Arrays.asList(PokemonType.GRASS, PokemonType.PSYCHIC), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 103), new RegionalEntry(Region.JOHTO, 103))),
                    
                createPokemon(104, "Cubone", "Porque nunca remove seu capacete de crânio, ninguém jamais viu o rosto real deste Pokémon.", 
                    Arrays.asList(PokemonType.GROUND), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 104), new RegionalEntry(Region.JOHTO, 104))),
                    
                createPokemon(105, "Marowak", "O osso que segura é sua arma principal. Arremessa o osso habilmente como um bumerangue para nocautear alvos.", 
                    Arrays.asList(PokemonType.GROUND), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 105), new RegionalEntry(Region.JOHTO, 105))),
                    
                createPokemon(106, "Hitmonlee", "Quando numa pressa, suas pernas se alongam progressivamente. Corre suavemente com passadas extra-longas.", 
                    Arrays.asList(PokemonType.FIGHTING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 106), new RegionalEntry(Region.JOHTO, 106))),
                    
                createPokemon(107, "Hitmonchan", "Enquanto aparentemente não faz nada, ataca socos extremamente rápidos e devastadores.", 
                    Arrays.asList(PokemonType.FIGHTING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 107), new RegionalEntry(Region.JOHTO, 107))),
                    
                createPokemon(108, "Lickitung", "Sua língua pode se estender como um camaleão. Deixa uma pegajosa saliva venenosa quando lambe.", 
                    Arrays.asList(PokemonType.NORMAL), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 108), new RegionalEntry(Region.JOHTO, 108))),
                    
                createPokemon(109, "Koffing", "Porque armazena vários tipos de gases tóxicos em seu corpo, é propenso a explodir sem aviso.", 
                    Arrays.asList(PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 109), new RegionalEntry(Region.JOHTO, 109))),
                    
                createPokemon(110, "Weezing", "Onde dois tipos de gases venenosos se encontram, duas Koffings podem fundir-se num Weezing durante muitos anos.", 
                    Arrays.asList(PokemonType.POISON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 110), new RegionalEntry(Region.JOHTO, 110))),
                    
                createPokemon(111, "Rhyhorn", "Suas pernas curtas e robustas são tão poderosas que podem facilmente arrebatar um trailer.", 
                    Arrays.asList(PokemonType.GROUND, PokemonType.ROCK), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 111), new RegionalEntry(Region.JOHTO, 111))),
                    
                createPokemon(112, "Rhydon", "Protegido por uma armadura semelhante a rochas, pode viver em lava de 3600 graus Fahrenheit.", 
                    Arrays.asList(PokemonType.GROUND, PokemonType.ROCK), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 112), new RegionalEntry(Region.JOHTO, 112))),
                    
                createPokemon(113, "Chansey", "Um Pokémon raro e elusivo que dizem trazer felicidade para quem consegue pegá-lo.", 
                    Arrays.asList(PokemonType.NORMAL), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 113), new RegionalEntry(Region.JOHTO, 113))),
                    
                createPokemon(114, "Tangela", "Todo o corpo é coberto por vinhas largas semelhantes a algas marinhas. As vinhas balançam quando anda.", 
                    Arrays.asList(PokemonType.GRASS), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 114), new RegionalEntry(Region.JOHTO, 114))),
                    
                createPokemon(115, "Kangaskhan", "A fêmea cria seu filhote em uma bolsa na barriga. É perita em fugir enquanto segura seu filhote.", 
                    Arrays.asList(PokemonType.NORMAL), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 115), new RegionalEntry(Region.JOHTO, 115))),
                    
                createPokemon(116, "Horsea", "Conhecido por derrubar insetos voadores atirando água de sua boca. Vive em recifes de coral.", 
                    Arrays.asList(PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 116), new RegionalEntry(Region.JOHTO, 116))),
                    
                createPokemon(117, "Seadra", "Capaz de nadar para trás girando rapidamente sua cauda semelhante a asa e suas nadadeiras peitorais.", 
                    Arrays.asList(PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 117), new RegionalEntry(Region.JOHTO, 117))),
                    
                createPokemon(118, "Goldeen", "Suas nadadeiras caudais ondulam elegantemente na água. É chamado de bailarina da água.", 
                    Arrays.asList(PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 118), new RegionalEntry(Region.JOHTO, 118))),
                    
                createPokemon(119, "Seaking", "Na época de desova, pode ser visto nadando vigorosamente rios acima, mesmo em cachoeiras.", 
                    Arrays.asList(PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 119), new RegionalEntry(Region.JOHTO, 119))),
                    
                createPokemon(120, "Staryu", "Aparece em grandes números na praia durante o verão. À noite, o centro de seu corpo pisca com uma luz vermelha.", 
                    Arrays.asList(PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 120), new RegionalEntry(Region.JOHTO, 120))),
                    
                createPokemon(121, "Starmie", "Seu corpo brilha como as estrelas no céu noturno. O núcleo no centro de seu corpo pisca em sete cores.", 
                    Arrays.asList(PokemonType.WATER, PokemonType.PSYCHIC), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 121), new RegionalEntry(Region.JOHTO, 121))),
                    
                createPokemon(122, "Mr. Mime", "Se interrompido enquanto está imitando, ele dará tapas com suas largas mãos.", 
                    Arrays.asList(PokemonType.PSYCHIC, PokemonType.FAIRY), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 122), new RegionalEntry(Region.JOHTO, 122))),
                    
                createPokemon(123, "Scyther", "Com garras ninja-rápidas, decepa suas presas e as corta em pedaços. Raramente usa suas asas para voar.", 
                    Arrays.asList(PokemonType.BUG, PokemonType.FLYING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 123), new RegionalEntry(Region.JOHTO, 123))),
                    
                createPokemon(124, "Jynx", "Caminha ritmicamente, balançando e balançando seus quadris como se estivesse dançando.", 
                    Arrays.asList(PokemonType.ICE, PokemonType.PSYCHIC), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 124), new RegionalEntry(Region.JOHTO, 124))),
                    
                createPokemon(125, "Electabuzz", "Normalmente encontrado perto de usinas de energia, alimenta-se de eletricidade como outras formas de energia.", 
                    Arrays.asList(PokemonType.ELECTRIC), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 125), new RegionalEntry(Region.JOHTO, 125))),
                    
                createPokemon(126, "Magmar", "Seu corpo queima com uma chama alaranjada que permite ser visto através de uma densa névoa amarela.", 
                    Arrays.asList(PokemonType.FIRE), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 126), new RegionalEntry(Region.JOHTO, 126))),
                    
                createPokemon(127, "Pinsir", "Se falhar para esmagar a vítima em suas pinças, ele irá balançar a vítima e arremessá-la.", 
                    Arrays.asList(PokemonType.BUG), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 127), new RegionalEntry(Region.JOHTO, 127))),
                    
                createPokemon(128, "Tauros", "Quando vê algo que se move, corre em sua direção e o ataca ferozmente com seus chifres afiados.", 
                    Arrays.asList(PokemonType.NORMAL), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 128), new RegionalEntry(Region.JOHTO, 128))),
                    
                createPokemon(129, "Magikarp", "Na verdade um Pokémon muito resistente e pode sobreviver em qualquer corpo de água, não importa quão poluído esteja.", 
                    Arrays.asList(PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 129), new RegionalEntry(Region.JOHTO, 76))),
                    
                createPokemon(130, "Gyarados", "Raramente visto na natureza. Enorme e feroz, é capaz de destruir cidades inteiras em fúria.", 
                    Arrays.asList(PokemonType.WATER, PokemonType.FLYING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 130), new RegionalEntry(Region.JOHTO, 77))),
                    
                createPokemon(131, "Lapras", "Um Pokémon gentil que adora transportar pessoas através dos mares. Há poucos restantes na natureza.", 
                    Arrays.asList(PokemonType.WATER, PokemonType.ICE), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 131), new RegionalEntry(Region.JOHTO, 131))),
                    
                createPokemon(132, "Ditto", "Capaz de copiar o código genético de um inimigo para transformar-se instantaneamente em uma réplica.", 
                    Arrays.asList(PokemonType.NORMAL), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 132), new RegionalEntry(Region.JOHTO, 132))),
                    
                createPokemon(133, "Eevee", "Seu código genético é irregular. Pode evoluir de várias maneiras diferentes dependendo do ambiente.", 
                    Arrays.asList(PokemonType.NORMAL), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 133), new RegionalEntry(Region.JOHTO, 133))),
                    
                createPokemon(134, "Vaporeon", "Vive perto da água. Sua cauda longa tem uma aparência semelhante a uma sereia e é coberta por uma fina membrana.", 
                    Arrays.asList(PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 134), new RegionalEntry(Region.JOHTO, 134))),
                    
                createPokemon(135, "Jolteon", "Acumula íons negativos na atmosfera para soltar raios de 10000 volts.", 
                    Arrays.asList(PokemonType.ELECTRIC), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 135), new RegionalEntry(Region.JOHTO, 135))),
                    
                createPokemon(136, "Flareon", "Quando armazenou energia térmica suficiente, sua temperatura corporal pode chegar a 1650 graus Fahrenheit.", 
                    Arrays.asList(PokemonType.FIRE), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 136), new RegionalEntry(Region.JOHTO, 136))),
                    
                createPokemon(137, "Porygon", "Um Pokémon que consiste inteiramente de código de programação. É capaz de se mover livremente no ciberespaço.", 
                    Arrays.asList(PokemonType.NORMAL), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 137), new RegionalEntry(Region.JOHTO, 137))),
                    
                createPokemon(138, "Omanyte", "Embora extinto há muito tempo, em raras ocasiões pode ser geneticamente ressuscitado de fósseis.", 
                    Arrays.asList(PokemonType.ROCK, PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 138), new RegionalEntry(Region.JOHTO, 138))),
                    
                createPokemon(139, "Omastar", "Um Pokémon pré-histórico que morreu quando sua concha espiral ficou grande demais para se mover.", 
                    Arrays.asList(PokemonType.ROCK, PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 139), new RegionalEntry(Region.JOHTO, 139))),
                    
                createPokemon(140, "Kabuto", "Um Pokémon ressuscitado de um fóssil encontrado no fundo do oceano. Não mudou em 300 milhões de anos.", 
                    Arrays.asList(PokemonType.ROCK, PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 140), new RegionalEntry(Region.JOHTO, 140))),
                    
                createPokemon(141, "Kabutops", "Sua forma aerodinâmica e suas garras aguçadas lhe permitiam nadar e capturar presas há 300 milhões de anos.", 
                    Arrays.asList(PokemonType.ROCK, PokemonType.WATER), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 141), new RegionalEntry(Region.JOHTO, 141))),
                    
                createPokemon(142, "Aerodactyl", "Um Pokémon feroz que foi ressuscitado de DNA fossilizado. Voa com um grito agudo.", 
                    Arrays.asList(PokemonType.ROCK, PokemonType.FLYING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 142), new RegionalEntry(Region.JOHTO, 142))),
                    
                createPokemon(143, "Snorlax", "Muito preguiçoso. Só se move para comer e dormir. Conforme seu peso corporal aumenta, fica ainda mais preguiçoso.", 
                    Arrays.asList(PokemonType.NORMAL), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 143), new RegionalEntry(Region.JOHTO, 143))),
                    
                createPokemon(144, "Articuno", "Um Pokémon pássaro lendário que pode controlar gelo. O bater de suas asas congela o ar.", 
                    Arrays.asList(PokemonType.ICE, PokemonType.FLYING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 144), new RegionalEntry(Region.JOHTO, 144))),
                    
                createPokemon(145, "Zapdos", "Um Pokémon pássaro lendário que pode controlar eletricidade. Geralmente vive em nuvens de tempestade.", 
                    Arrays.asList(PokemonType.ELECTRIC, PokemonType.FLYING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 145), new RegionalEntry(Region.JOHTO, 145))),
                    
                createPokemon(146, "Moltres", "Conhecido como o pássaro lendário do fogo. Toda batida de suas asas cria uma brilhante chama alaranjada.", 
                    Arrays.asList(PokemonType.FIRE, PokemonType.FLYING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 146), new RegionalEntry(Region.JOHTO, 146))),
                    
                createPokemon(147, "Dratini", "Muito tempo considerado um Pokémon mítico até que recentemente foi encontrado em uma expedição submarina.", 
                    Arrays.asList(PokemonType.DRAGON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 147), new RegionalEntry(Region.JOHTO, 147))),
                    
                createPokemon(148, "Dragonair", "Um Pokémon místico que exala uma aura gentil. Tem a capacidade de mudar o clima.", 
                    Arrays.asList(PokemonType.DRAGON), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 148), new RegionalEntry(Region.JOHTO, 148))),
                    
                createPokemon(149, "Dragonite", "Um Pokémon marinho que é extremamente raro. Dizem que sua inteligência corresponde à dos humanos.", 
                    Arrays.asList(PokemonType.DRAGON, PokemonType.FLYING), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 149), new RegionalEntry(Region.JOHTO, 149))),
                    
                createPokemon(150, "Mewtwo", "Foi criado por um cientista após anos de horríveis experimentos de engenharia genética.", 
                    Arrays.asList(PokemonType.PSYCHIC), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 150), new RegionalEntry(Region.JOHTO, 150))),
                    
                createPokemon(151, "Mew", "Tão raro que ainda é considerado um mito por muitos especialistas. Apenas alguns o viram em todo o mundo.", 
                    Arrays.asList(PokemonType.PSYCHIC), Region.KANTO,
                    Arrays.asList(new RegionalEntry(Region.KANTO, 151), new RegionalEntry(Region.JOHTO, 151)))
        );
    }

    private Pokemon createPokemon(Integer nationalNumber, String name, String description, 
                                 List<PokemonType> types, Region originRegion, 
                                 List<RegionalEntry> regionalEntries) {
        
        Map<PokemonType, TypeEffectiveness> weaknesses = TypeEffectivenessCalculator.calculateWeaknesses(types);
        Map<PokemonType, TypeEffectiveness> resistances = TypeEffectivenessCalculator.calculateResistances(types);
        
        return new Pokemon(nationalNumber, name, description, types, originRegion, 
                          regionalEntries, weaknesses, resistances);
    }
}
