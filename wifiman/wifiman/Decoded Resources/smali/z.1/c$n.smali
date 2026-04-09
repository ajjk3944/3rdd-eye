.class final Lz/c$n;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/c;->n(F)Lz/c$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lz/c$n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz/c$n;

    invoke-direct {v0}, Lz/c$n;-><init>()V

    sput-object v0, Lz/c$n;->a:Lz/c$n;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(ILY0/t;)Ljava/lang/Integer;
    .locals 2

    sget-object v0, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v0}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1, p2}, Lf0/c$b;->a(IILY0/t;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, LY0/t;

    invoke-virtual {p0, p1, p2}, Lz/c$n;->a(ILY0/t;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
