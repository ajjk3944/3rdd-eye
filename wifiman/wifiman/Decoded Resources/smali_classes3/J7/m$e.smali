.class final LJ7/m$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/m;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LJ7/m$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ7/m$e;

    invoke-direct {v0}, LJ7/m$e;-><init>()V

    sput-object v0, LJ7/m$e;->a:LJ7/m$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lhg/c;)V
    .locals 0

    sget-object p1, LJ7/m$e$a;->a:LJ7/m$e$a;

    invoke-static {p1}, LN7/a;->b(Lmh/a;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, LJ7/m$e;->a(Lhg/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
