.class public final LE0/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE0/n0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE0/j0$b;
    }
.end annotation


# static fields
.field public static final b:LE0/j0$b;

.field public static final c:I

.field private static final d:Lmh/l;


# instance fields
.field private final a:LE0/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LE0/j0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LE0/j0$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LE0/j0;->b:LE0/j0$b;

    const/16 v0, 0x8

    sput v0, LE0/j0;->c:I

    sget-object v0, LE0/j0$a;->a:LE0/j0$a;

    sput-object v0, LE0/j0;->d:Lmh/l;

    return-void
.end method

.method public constructor <init>(LE0/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE0/j0;->a:LE0/h0;

    return-void
.end method

.method public static final synthetic a()Lmh/l;
    .locals 1

    sget-object v0, LE0/j0;->d:Lmh/l;

    return-object v0
.end method


# virtual methods
.method public final b()LE0/h0;
    .locals 1

    iget-object v0, p0, LE0/j0;->a:LE0/h0;

    return-object v0
.end method

.method public h0()Z
    .locals 1

    iget-object v0, p0, LE0/j0;->a:LE0/h0;

    invoke-interface {v0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    return v0
.end method
