.class final LJ0/q$e;
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
.field public static final a:LJ0/q$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ0/q$e;

    invoke-direct {v0}, LJ0/q$e;-><init>()V

    sput-object v0, LJ0/q$e;->a:LJ0/q$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LYg/J;LYg/J;)LYg/J;
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    check-cast p2, LYg/J;

    invoke-virtual {p0, p1, p2}, LJ0/q$e;->a(LYg/J;LYg/J;)LYg/J;

    move-result-object p1

    return-object p1
.end method
