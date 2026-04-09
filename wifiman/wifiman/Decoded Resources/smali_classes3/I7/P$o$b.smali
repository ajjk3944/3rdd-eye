.class final LI7/P$o$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P$o;->h(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LI7/P$o$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI7/P$o$b;

    invoke-direct {v0}, LI7/P$o$b;-><init>()V

    sput-object v0, LI7/P$o$b;->a:LI7/P$o$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Tunnel reconnection worker should never complete"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
