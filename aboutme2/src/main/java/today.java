 
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . a n n o t a t i o n . W e b S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e s p o n s e ;  
  
 i m p o r t   j a v a . t i m e . L o c a l D a t e T i m e ;  
 i m p o r t   j a v a . t i m e . f o r m a t . D a t e T i m e F o r m a t t e r ;  
 / * *  
   *   S e r v l e t   i m p l e m e n t a t i o n   c l a s s   T o d a y S e r v l e t  
   * /  
 @ W e b S e r v l e t ( " / t o d a y " )  
 p u b l i c   c l a s s   t o d a y   e x t e n d s   H t t p S e r v l e t   {  
 	 p r i v a t e   s t a t i c   f i n a l   l o n g   s e r i a l V e r s i o n U I D   =   1 L ;  
                
         / * *  
           *   @ s e e   H t t p S e r v l e t # H t t p S e r v l e t ( )  
           * /  
         p u b l i c   t o d a y ( )   {  
                 s u p e r ( ) ;  
                 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
         }  
  
 	 / * *  
 	   *   @ s e e   H t t p S e r v l e t # d o G e t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )  
 	   * /  
 	 p r o t e c t e d   v o i d   d o G e t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )   t h r o w s   S e r v l e t E x c e p t i o n ,   I O E x c e p t i o n   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 r e s p o n s e . s e t C o n t e n t T y p e ( " t e x t / h t m l ; c h a r s e t = U T F - 8 " ) ;  
 	 	 P r i n t W r i t e r   o u t   =   r e s p o n s e . g e t W r i t e r ( ) ;  
 	 	 o u t . p r i n t l n ( " < h t m l > " ) ;  
 	 	 o u t . p r i n t l n ( " < h e a d > < t i t l e > i n f o < / t i t l e > < / h e a d > " ) ;  
 	 	 o u t . p r i n t l n ( " < b o d y > " ) ;  
 	 	 L o c a l D a t e T i m e   n o w   =   L o c a l D a t e T i m e . n o w ( ) ;  
 	 	 D a t e T i m e F o r m a t t e r   h t m l r e s   =   D a t e T i m e F o r m a t t e r . o f P a t t e r n ( " y y y y / M M / d d   H H : m m : s s " ) ; 	  
 	 	 S t r i n g   h t m l   =   n o w . f o r m a t ( h t m l r e s ) ;  
 	 	 o u t . p r i n t l n ( " < a   h r e f = \ " i n d e x . h t m l \ " > T�x�T�t�< / a > " ) ;  
 	 	 o u t . p r i n t l n ( " < p   s t y l e   = \ " t e x t - a l i g n : c e n t e r ;   f o n t - s i z e :   4 0 p x ; \ " > "   +   " ֬����  :   "   +   h t m l   +     " < / p > " ) ;  
 	 	 o u t . p r i n t l n ( " < / b o d y > " ) ;  
 	 	 o u t . p r i n t l n ( " < / h t m l > " ) ;  
 	 	  
 	 }  
  
 	 / * *  
 	   *   @ s e e   H t t p S e r v l e t # d o P o s t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )  
 	   * /  
 	 p r o t e c t e d   v o i d   d o P o s t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )   t h r o w s   S e r v l e t E x c e p t i o n ,   I O E x c e p t i o n   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 d o G e t ( r e q u e s t ,   r e s p o n s e ) ;  
 	 }  
  
 }  
 