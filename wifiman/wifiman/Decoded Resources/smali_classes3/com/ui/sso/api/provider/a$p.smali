.class public final Lcom/ui/sso/api/provider/a$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/sso/api/provider/a;-><init>(Lcom/ui/sso/api/UiAccountApi$c;Lcom/ui/sso/api/UiAccountApi$d;Landroid/content/ContentResolver;Lcom/ui/sso/api/provider/f;LWa/a;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;Lcom/ui/sso/auth/UiAuthSerializer;LIi/N;LIi/J;LIi/J;Lcom/ui/sso/api/provider/a$b$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LLi/g;


# direct methods
.method public constructor <init>(LLi/g;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/sso/api/provider/a$p;->a:LLi/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/sso/api/provider/a$p;->a:LLi/g;

    new-instance v1, Lcom/ui/sso/api/provider/a$p$a;

    invoke-direct {v1, p1}, Lcom/ui/sso/api/provider/a$p$a;-><init>(LLi/h;)V

    invoke-interface {v0, v1, p2}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
