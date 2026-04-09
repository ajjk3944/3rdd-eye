.class public final LF7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LF7/c;

.field private static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LF7/c;

    invoke-direct {v0}, LF7/c;-><init>()V

    sput-object v0, LF7/c;->a:LF7/c;

    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0}, LF7/c;->b()Ljava/util/Map;

    move-result-object v2

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    const/16 v2, 0x24

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0}, LF7/c;->d()Ljava/util/Map;

    move-result-object v3

    invoke-static {v2, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v2

    const/16 v3, 0x1c

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0}, LF7/c;->c()Ljava/util/Map;

    move-result-object v0

    invoke-static {v3, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    filled-new-array {v1, v2, v0}, [LYg/s;

    move-result-object v0

    invoke-static {v0}, LZg/U;->l([LYg/s;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LF7/c;->b:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b()Ljava/util/Map;
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, LF7/d;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/o;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/z;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/G;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/H;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/I;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/J;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/K;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/L;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/M;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/e;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/f;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/g;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/h;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/i;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/j;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/k;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/l;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/m;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/n;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/p;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/q;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/r;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/s;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/t;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/u;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/v;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/w;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/x;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/y;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/A;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/B;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/C;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/D;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/E;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/F;->a(Ljava/util/HashMap;)V

    return-object v0
.end method

.method private final c()Ljava/util/Map;
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, LF7/N;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/O;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/P;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/Q;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/S;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/T;->a(Ljava/util/HashMap;)V

    return-object v0
.end method

.method private final d()Ljava/util/Map;
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, LF7/U;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/W;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/X;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/Y;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/Z;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/a0;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/b0;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/c0;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/d0;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/e0;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, LF7/V;->a(Ljava/util/HashMap;)V

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    sget-object v0, LF7/c;->b:Ljava/util/Map;

    return-object v0
.end method
