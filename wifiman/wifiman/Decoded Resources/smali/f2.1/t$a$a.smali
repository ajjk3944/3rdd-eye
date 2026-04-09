.class final Lf2/t$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/t$a;->a(Lf2/t;)Lzi/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lf2/t$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf2/t$a$a;

    invoke-direct {v0}, Lf2/t$a$a;-><init>()V

    sput-object v0, Lf2/t$a$a;->a:Lf2/t$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lf2/r;)Lf2/r;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lf2/t;

    if-eqz v0, :cond_0

    check-cast p1, Lf2/t;

    invoke-virtual {p1}, Lf2/t;->V()I

    move-result v0

    invoke-virtual {p1, v0}, Lf2/t;->N(I)Lf2/r;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf2/r;

    invoke-virtual {p0, p1}, Lf2/t$a$a;->a(Lf2/r;)Lf2/r;

    move-result-object p1

    return-object p1
.end method
