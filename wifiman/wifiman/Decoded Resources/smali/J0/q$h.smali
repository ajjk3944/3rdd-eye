.class final LJ0/q$h;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ0/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LJ0/q$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ0/q$h;

    invoke-direct {v0}, LJ0/q$h;-><init>()V

    sput-object v0, LJ0/q$h;->a:LJ0/q$h;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJ0/g;I)LJ0/g;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ0/g;

    check-cast p2, LJ0/g;

    invoke-virtual {p2}, LJ0/g;->n()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LJ0/q$h;->a(LJ0/g;I)LJ0/g;

    move-result-object p1

    return-object p1
.end method
