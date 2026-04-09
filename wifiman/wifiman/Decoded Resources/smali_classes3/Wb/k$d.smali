.class LWb/k$d;
.super Lm2/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWb/k;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LWb/k;


# direct methods
.method constructor <init>(LWb/k;Lm2/q;)V
    .locals 0

    iput-object p1, p0, LWb/k$d;->d:LWb/k;

    invoke-direct {p0, p2}, Lm2/w;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM signalMapperPlaces WHERE id in (?)"

    return-object v0
.end method
