.class final Lr/p0$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/p0$a;->a()Landroidx/compose/runtime/snapshots/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lr/p0$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr/p0$a$a;

    invoke-direct {v0}, Lr/p0$a$a;-><init>()V

    sput-object v0, Lr/p0$a$a;->a:Lr/p0$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lmh/a;)V
    .locals 0

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmh/a;

    invoke-virtual {p0, p1}, Lr/p0$a$a;->a(Lmh/a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
