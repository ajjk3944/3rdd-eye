.class public abstract Lcom/google/gson/internal/bind/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/gson/internal/bind/l$I;
    }
.end annotation


# static fields
.field public static final A:Lcom/google/gson/p;

.field public static final B:Lcom/google/gson/p;

.field public static final C:Lcom/google/gson/q;

.field public static final D:Lcom/google/gson/p;

.field public static final E:Lcom/google/gson/q;

.field public static final F:Lcom/google/gson/p;

.field public static final G:Lcom/google/gson/q;

.field public static final H:Lcom/google/gson/p;

.field public static final I:Lcom/google/gson/q;

.field public static final J:Lcom/google/gson/p;

.field public static final K:Lcom/google/gson/q;

.field public static final L:Lcom/google/gson/p;

.field public static final M:Lcom/google/gson/q;

.field public static final N:Lcom/google/gson/p;

.field public static final O:Lcom/google/gson/q;

.field public static final P:Lcom/google/gson/p;

.field public static final Q:Lcom/google/gson/q;

.field public static final R:Lcom/google/gson/p;

.field public static final S:Lcom/google/gson/q;

.field public static final T:Lcom/google/gson/p;

.field public static final U:Lcom/google/gson/q;

.field public static final V:Lcom/google/gson/p;

.field public static final W:Lcom/google/gson/q;

.field public static final X:Lcom/google/gson/q;

.field public static final a:Lcom/google/gson/p;

.field public static final b:Lcom/google/gson/q;

.field public static final c:Lcom/google/gson/p;

.field public static final d:Lcom/google/gson/q;

.field public static final e:Lcom/google/gson/p;

.field public static final f:Lcom/google/gson/p;

.field public static final g:Lcom/google/gson/q;

.field public static final h:Lcom/google/gson/p;

.field public static final i:Lcom/google/gson/q;

.field public static final j:Lcom/google/gson/p;

.field public static final k:Lcom/google/gson/q;

.field public static final l:Lcom/google/gson/p;

.field public static final m:Lcom/google/gson/q;

.field public static final n:Lcom/google/gson/p;

.field public static final o:Lcom/google/gson/q;

.field public static final p:Lcom/google/gson/p;

.field public static final q:Lcom/google/gson/q;

.field public static final r:Lcom/google/gson/p;

.field public static final s:Lcom/google/gson/q;

.field public static final t:Lcom/google/gson/p;

.field public static final u:Lcom/google/gson/p;

.field public static final v:Lcom/google/gson/p;

.field public static final w:Lcom/google/gson/p;

.field public static final x:Lcom/google/gson/q;

.field public static final y:Lcom/google/gson/p;

.field public static final z:Lcom/google/gson/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/gson/internal/bind/l$k;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$k;-><init>()V

    invoke-virtual {v0}, Lcom/google/gson/p;->a()Lcom/google/gson/p;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->a:Lcom/google/gson/p;

    const-class v1, Ljava/lang/Class;

    invoke-static {v1, v0}, Lcom/google/gson/internal/bind/l;->a(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->b:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$v;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$v;-><init>()V

    invoke-virtual {v0}, Lcom/google/gson/p;->a()Lcom/google/gson/p;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->c:Lcom/google/gson/p;

    const-class v1, Ljava/util/BitSet;

    invoke-static {v1, v0}, Lcom/google/gson/internal/bind/l;->a(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->d:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$A;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$A;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/l;->e:Lcom/google/gson/p;

    new-instance v1, Lcom/google/gson/internal/bind/l$C;

    invoke-direct {v1}, Lcom/google/gson/internal/bind/l$C;-><init>()V

    sput-object v1, Lcom/google/gson/internal/bind/l;->f:Lcom/google/gson/p;

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Boolean;

    invoke-static {v1, v2, v0}, Lcom/google/gson/internal/bind/l;->b(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->g:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$D;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$D;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/l;->h:Lcom/google/gson/p;

    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Byte;

    invoke-static {v1, v2, v0}, Lcom/google/gson/internal/bind/l;->b(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->i:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$E;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$E;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/l;->j:Lcom/google/gson/p;

    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Short;

    invoke-static {v1, v2, v0}, Lcom/google/gson/internal/bind/l;->b(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->k:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$F;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$F;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/l;->l:Lcom/google/gson/p;

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Integer;

    invoke-static {v1, v2, v0}, Lcom/google/gson/internal/bind/l;->b(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->m:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$G;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$G;-><init>()V

    invoke-virtual {v0}, Lcom/google/gson/p;->a()Lcom/google/gson/p;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->n:Lcom/google/gson/p;

    const-class v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {v1, v0}, Lcom/google/gson/internal/bind/l;->a(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->o:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$H;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$H;-><init>()V

    invoke-virtual {v0}, Lcom/google/gson/p;->a()Lcom/google/gson/p;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->p:Lcom/google/gson/p;

    const-class v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {v1, v0}, Lcom/google/gson/internal/bind/l;->a(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->q:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$a;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/gson/p;->a()Lcom/google/gson/p;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->r:Lcom/google/gson/p;

    const-class v1, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-static {v1, v0}, Lcom/google/gson/internal/bind/l;->a(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->s:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$b;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$b;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/l;->t:Lcom/google/gson/p;

    new-instance v0, Lcom/google/gson/internal/bind/l$c;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$c;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/l;->u:Lcom/google/gson/p;

    new-instance v0, Lcom/google/gson/internal/bind/l$d;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$d;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/l;->v:Lcom/google/gson/p;

    new-instance v0, Lcom/google/gson/internal/bind/l$e;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$e;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/l;->w:Lcom/google/gson/p;

    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Character;

    invoke-static {v1, v2, v0}, Lcom/google/gson/internal/bind/l;->b(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->x:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$f;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$f;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/l;->y:Lcom/google/gson/p;

    new-instance v1, Lcom/google/gson/internal/bind/l$g;

    invoke-direct {v1}, Lcom/google/gson/internal/bind/l$g;-><init>()V

    sput-object v1, Lcom/google/gson/internal/bind/l;->z:Lcom/google/gson/p;

    new-instance v1, Lcom/google/gson/internal/bind/l$h;

    invoke-direct {v1}, Lcom/google/gson/internal/bind/l$h;-><init>()V

    sput-object v1, Lcom/google/gson/internal/bind/l;->A:Lcom/google/gson/p;

    new-instance v1, Lcom/google/gson/internal/bind/l$i;

    invoke-direct {v1}, Lcom/google/gson/internal/bind/l$i;-><init>()V

    sput-object v1, Lcom/google/gson/internal/bind/l;->B:Lcom/google/gson/p;

    const-class v1, Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/google/gson/internal/bind/l;->a(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->C:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$j;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$j;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/l;->D:Lcom/google/gson/p;

    const-class v1, Ljava/lang/StringBuilder;

    invoke-static {v1, v0}, Lcom/google/gson/internal/bind/l;->a(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->E:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$l;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$l;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/l;->F:Lcom/google/gson/p;

    const-class v1, Ljava/lang/StringBuffer;

    invoke-static {v1, v0}, Lcom/google/gson/internal/bind/l;->a(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->G:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$m;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$m;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/l;->H:Lcom/google/gson/p;

    const-class v1, Ljava/net/URL;

    invoke-static {v1, v0}, Lcom/google/gson/internal/bind/l;->a(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->I:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$n;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$n;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/l;->J:Lcom/google/gson/p;

    const-class v1, Ljava/net/URI;

    invoke-static {v1, v0}, Lcom/google/gson/internal/bind/l;->a(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->K:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$o;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$o;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/l;->L:Lcom/google/gson/p;

    const-class v1, Ljava/net/InetAddress;

    invoke-static {v1, v0}, Lcom/google/gson/internal/bind/l;->d(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->M:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$p;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$p;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/l;->N:Lcom/google/gson/p;

    const-class v1, Ljava/util/UUID;

    invoke-static {v1, v0}, Lcom/google/gson/internal/bind/l;->a(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->O:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$q;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$q;-><init>()V

    invoke-virtual {v0}, Lcom/google/gson/p;->a()Lcom/google/gson/p;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->P:Lcom/google/gson/p;

    const-class v1, Ljava/util/Currency;

    invoke-static {v1, v0}, Lcom/google/gson/internal/bind/l;->a(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->Q:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$r;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$r;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/l;->R:Lcom/google/gson/p;

    const-class v1, Ljava/util/Calendar;

    const-class v2, Ljava/util/GregorianCalendar;

    invoke-static {v1, v2, v0}, Lcom/google/gson/internal/bind/l;->c(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->S:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$s;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$s;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/l;->T:Lcom/google/gson/p;

    const-class v1, Ljava/util/Locale;

    invoke-static {v1, v0}, Lcom/google/gson/internal/bind/l;->a(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->U:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$t;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$t;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/l;->V:Lcom/google/gson/p;

    const-class v1, Lcom/google/gson/g;

    invoke-static {v1, v0}, Lcom/google/gson/internal/bind/l;->d(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/l;->W:Lcom/google/gson/q;

    new-instance v0, Lcom/google/gson/internal/bind/l$u;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/l$u;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/l;->X:Lcom/google/gson/q;

    return-void
.end method

.method public static a(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;
    .locals 1

    new-instance v0, Lcom/google/gson/internal/bind/l$w;

    invoke-direct {v0, p0, p1}, Lcom/google/gson/internal/bind/l$w;-><init>(Ljava/lang/Class;Lcom/google/gson/p;)V

    return-object v0
.end method

.method public static b(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;
    .locals 1

    new-instance v0, Lcom/google/gson/internal/bind/l$x;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/gson/internal/bind/l$x;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/p;)V

    return-object v0
.end method

.method public static c(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;
    .locals 1

    new-instance v0, Lcom/google/gson/internal/bind/l$y;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/gson/internal/bind/l$y;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/p;)V

    return-object v0
.end method

.method public static d(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;
    .locals 1

    new-instance v0, Lcom/google/gson/internal/bind/l$z;

    invoke-direct {v0, p0, p1}, Lcom/google/gson/internal/bind/l$z;-><init>(Ljava/lang/Class;Lcom/google/gson/p;)V

    return-object v0
.end method
