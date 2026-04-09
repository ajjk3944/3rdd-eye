.class final LM/z$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM/z$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM/z$a;

    invoke-direct {v0}, LM/z$a;-><init>()V

    sput-object v0, LM/z$a;->a:LM/z$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)Lr/n;
    .locals 2

    invoke-static {p1, p2}, Ll0/h;->c(J)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lr/n;

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v1

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    invoke-direct {v0, v1, p1}, Lr/n;-><init>(FF)V

    goto :goto_0

    :cond_0
    invoke-static {}, LM/z;->a()Lr/n;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ll0/g;

    invoke-virtual {p1}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LM/z$a;->a(J)Lr/n;

    move-result-object p1

    return-object p1
.end method
