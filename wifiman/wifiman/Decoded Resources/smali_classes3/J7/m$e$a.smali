.class final LJ7/m$e$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/m$e;->a(Lhg/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LJ7/m$e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ7/m$e$a;

    invoke-direct {v0}, LJ7/m$e$a;-><init>()V

    sput-object v0, LJ7/m$e$a;->a:LJ7/m$e$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "CLOUD - connection info request"

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJ7/m$e$a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
