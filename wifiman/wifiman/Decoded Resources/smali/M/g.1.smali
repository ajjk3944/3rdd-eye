.class final LM/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LM/g;

.field private static b:Lm0/J0;

.field private static c:Lm0/n0;

.field private static d:Lo0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM/g;

    invoke-direct {v0}, LM/g;-><init>()V

    sput-object v0, LM/g;->a:LM/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lm0/n0;
    .locals 1

    sget-object v0, LM/g;->c:Lm0/n0;

    return-object v0
.end method

.method public final b()Lo0/a;
    .locals 1

    sget-object v0, LM/g;->d:Lo0/a;

    return-object v0
.end method

.method public final c()Lm0/J0;
    .locals 1

    sget-object v0, LM/g;->b:Lm0/J0;

    return-object v0
.end method

.method public final d(Lm0/n0;)V
    .locals 0

    sput-object p1, LM/g;->c:Lm0/n0;

    return-void
.end method

.method public final e(Lo0/a;)V
    .locals 0

    sput-object p1, LM/g;->d:Lo0/a;

    return-void
.end method

.method public final f(Lm0/J0;)V
    .locals 0

    sput-object p1, LM/g;->b:Lm0/J0;

    return-void
.end method
