.class final LE8/A$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/A;->t0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE8/A$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/A$o;

    invoke-direct {v0}, LE8/A$o;-><init>()V

    sput-object v0, LE8/A$o;->a:LE8/A$o;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljf/f;)Z
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljf/f;->b()Z

    move-result p1

    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljf/f;

    invoke-virtual {p0, p1}, LE8/A$o;->a(Ljf/f;)Z

    move-result p1

    return p1
.end method
