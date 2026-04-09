.class LWb/b$c;
.super Lm2/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWb/b;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LWb/b;


# direct methods
.method constructor <init>(LWb/b;Lm2/q;)V
    .locals 0

    iput-object p1, p0, LWb/b$c;->d:LWb/b;

    invoke-direct {p0, p2}, Lm2/w;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "UPDATE floorplanRecord SET name = ? WHERE id = ?"

    return-object v0
.end method
