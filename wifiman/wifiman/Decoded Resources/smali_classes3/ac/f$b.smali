.class Lac/f$b;
.super Lm2/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lac/f;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lac/f;


# direct methods
.method constructor <init>(Lac/f;Lm2/q;)V
    .locals 0

    iput-object p1, p0, Lac/f$b;->d:Lac/f;

    invoke-direct {p0, p2}, Lm2/w;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM console WHERE id = ?"

    return-object v0
.end method
