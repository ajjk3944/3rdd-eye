.class final LV8/k$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/k;-><init>(LG6/G;Lh9/a;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;LV8/e$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LV8/k$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV8/k$g;

    invoke-direct {v0}, LV8/k$g;-><init>()V

    sput-object v0, LV8/k$g;->a:LV8/k$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LG6/O;)Lgg/v;
    .locals 2

    const-string/jumbo v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LG6/O;->a(Z)Lgg/s;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgg/s;->x0(I)LBg/a;

    move-result-object p1

    invoke-virtual {p1}, LBg/a;->l1()Lgg/s;

    move-result-object p1

    const-string/jumbo v0, "device.establishConnecti\u2026              .refCount()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lgg/s;->f0()Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "connectionStream.ignoreElements()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LV8/k$g$a;

    invoke-direct {v1, v0}, LV8/k$g$a;-><init>(Lgg/b;)V

    invoke-virtual {p1, v1}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LG6/O;

    invoke-virtual {p0, p1}, LV8/k$g;->a(LG6/O;)Lgg/v;

    move-result-object p1

    return-object p1
.end method
