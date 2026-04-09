.class final LJ0/n$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ0/n;->r()LJ0/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LJ0/n$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ0/n$f;

    invoke-direct {v0}, LJ0/n$f;-><init>()V

    sput-object v0, LJ0/n$f;->a:LJ0/n$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LE0/G;)Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p1}, LE0/G;->k0()LE0/a0;

    move-result-object p1

    const/16 v0, 0x8

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-virtual {p1, v0}, LE0/a0;->q(I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE0/G;

    invoke-virtual {p0, p1}, LJ0/n$f;->a(LE0/G;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
