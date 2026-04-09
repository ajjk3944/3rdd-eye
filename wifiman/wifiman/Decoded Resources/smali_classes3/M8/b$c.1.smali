.class final LM8/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/b;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/b$c;

    invoke-direct {v0}, LM8/b$c;-><init>()V

    sput-object v0, LM8/b$c;->a:LM8/b$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ll9/a;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lle/i;

    if-eqz p1, :cond_2

    new-instance v0, LDf/b;

    invoke-virtual {p1}, Lle/i;->f()LS8/e;

    move-result-object v1

    invoke-virtual {v1}, LS8/e;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lle/i;->p()LS8/j;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, LAf/y;->c(LS8/j;)Ls9/d;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    new-instance p1, Ls9/d$b;

    const v2, 0x7f1103c6

    invoke-direct {p1, v2}, Ls9/d$b;-><init>(I)V

    :cond_1
    invoke-direct {v0, v1, p1}, LDf/b;-><init>(Ljava/util/List;Ls9/d;)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LM8/b$c;->a(Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
