.class final LC0/w$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC0/w;->a(Landroidx/compose/ui/e;Lmh/p;LC0/C;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LC0/w$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC0/w$a;

    invoke-direct {v0}, LC0/w$a;-><init>()V

    sput-object v0, LC0/w$a;->a:LC0/w$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LE0/G;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LE0/G;->A1(Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE0/G;

    invoke-virtual {p0, p1}, LC0/w$a;->a(LE0/G;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
