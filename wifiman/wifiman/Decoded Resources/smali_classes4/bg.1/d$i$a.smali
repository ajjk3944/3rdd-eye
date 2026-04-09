.class public abstract Lbg/d$i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbg/d$i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final j:Lbg/d$i$b;


# instance fields
.field protected a:Lbg/d$i$b;

.field protected b:Z

.field protected c:I

.field protected d:Ljava/lang/String;

.field protected e:Ljava/lang/Character;

.field protected f:Ljava/lang/String;

.field protected g:Z

.field protected h:Z

.field protected i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbg/d$i$b;

    invoke-direct {v0}, Lbg/d$i$b;-><init>()V

    sput-object v0, Lbg/d$i$a;->j:Lbg/d$i$b;

    return-void
.end method

.method public constructor <init>(IC)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lbg/d$i$a;->j:Lbg/d$i$b;

    iput-object v0, p0, Lbg/d$i$a;->a:Lbg/d$i$b;

    const-string v0, ""

    iput-object v0, p0, Lbg/d$i$a;->d:Ljava/lang/String;

    iput-object v0, p0, Lbg/d$i$a;->f:Ljava/lang/String;

    iput p1, p0, Lbg/d$i$a;->c:I

    invoke-static {p2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    iput-object p1, p0, Lbg/d$i$a;->e:Ljava/lang/Character;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lbg/d$i$a;
    .locals 0

    iput-object p1, p0, Lbg/d$i$a;->f:Ljava/lang/String;

    return-object p0
.end method

.method public b(Z)Lbg/d$i$a;
    .locals 0

    iput-boolean p1, p0, Lbg/d$i$a;->b:Z

    return-object p0
.end method

.method public c(I)Lbg/d$i$a;
    .locals 0

    iput p1, p0, Lbg/d$i$a;->c:I

    return-object p0
.end method

.method public d(Z)Lbg/d$i$a;
    .locals 0

    iput-boolean p1, p0, Lbg/d$i$a;->g:Z

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lbg/d$i$a;
    .locals 0

    iput-object p1, p0, Lbg/d$i$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public f(Ljava/lang/Character;)Lbg/d$i$a;
    .locals 0

    iput-object p1, p0, Lbg/d$i$a;->e:Ljava/lang/Character;

    return-object p0
.end method

.method public g(Z)Lbg/d$i$a;
    .locals 0

    iput-boolean p1, p0, Lbg/d$i$a;->h:Z

    return-object p0
.end method

.method public h(Lbg/d$i$b;)Lbg/d$i$a;
    .locals 0

    iput-object p1, p0, Lbg/d$i$a;->a:Lbg/d$i$b;

    return-object p0
.end method
