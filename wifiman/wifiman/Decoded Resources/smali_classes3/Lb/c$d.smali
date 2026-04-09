.class LLb/c$d;
.super Lm2/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLb/c;-><init>(Lm2/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LLb/c;


# direct methods
.method constructor <init>(LLb/c;Lm2/q;)V
    .locals 0

    iput-object p1, p0, LLb/c$d;->d:LLb/c;

    invoke-direct {p0, p2}, Lm2/w;-><init>(Lm2/q;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "UPDATE ssoAccount SET isPrimary = CASE uuid WHEN ? THEN 1 ELSE 0 END"

    return-object v0
.end method
