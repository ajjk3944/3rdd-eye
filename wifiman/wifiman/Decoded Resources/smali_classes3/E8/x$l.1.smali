.class final LE8/x$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/x;->onStart(Landroidx/lifecycle/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE8/x$l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/x$l;

    invoke-direct {v0}, LE8/x$l;-><init>()V

    sput-object v0, LE8/x$l;->a:LE8/x$l;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lnf/b;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lnf/b;

    invoke-virtual {p0, p1}, LE8/x$l;->a(Lnf/b;)V

    return-void
.end method
