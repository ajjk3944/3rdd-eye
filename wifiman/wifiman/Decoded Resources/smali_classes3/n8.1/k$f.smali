.class final Ln8/k$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/k;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ln8/k$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln8/k$f;

    invoke-direct {v0}, Ln8/k$f;-><init>()V

    sput-object v0, Ln8/k$f;->a:Ln8/k$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ls9/d;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LCc/a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, LCc/a;->j()LDc/j;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LDc/j;->getName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Ls9/d$c;

    invoke-direct {v0, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ls9/d$b;

    const p1, 0x7f1100af

    invoke-direct {v0, p1}, Ls9/d$b;-><init>(I)V

    :goto_0
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Ln8/k$f;->a(Ll9/a;)Ls9/d;

    move-result-object p1

    return-object p1
.end method
