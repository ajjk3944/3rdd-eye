.class LNb/f$c;
.super Lm2/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNb/f;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LNb/f;


# direct methods
.method constructor <init>(LNb/f;Lm2/q;)V
    .locals 0

    iput-object p1, p0, LNb/f$c;->d:LNb/f;

    invoke-direct {p0, p2}, Lm2/w;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM cloudConsoles WHERE ssoAccountId != ?"

    return-object v0
.end method
