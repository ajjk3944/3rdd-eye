.class final LL0/E$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL0/E;->h(LL0/D;)LL0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LL0/E$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL0/E$a;

    invoke-direct {v0}, LL0/E$a;-><init>()V

    sput-object v0, LL0/E$a;->a:LL0/E$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LW0/n;
    .locals 1

    invoke-static {}, LL0/E;->a()LW0/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LL0/E$a;->a()LW0/n;

    move-result-object v0

    return-object v0
.end method
