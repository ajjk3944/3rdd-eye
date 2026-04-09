.class public final synthetic Lfb/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lfb/k;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lfb/k;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/i;->a:Lfb/k;

    iput-object p2, p0, Lfb/i;->b:Ljava/lang/String;

    iput-object p3, p0, Lfb/i;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lfb/i;->a:Lfb/k;

    iget-object v1, p0, Lfb/i;->b:Ljava/lang/String;

    iget-object v2, p0, Lfb/i;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lfb/k;->u(Lfb/k;Ljava/lang/String;Ljava/lang/String;)Lgg/b;

    move-result-object v0

    return-object v0
.end method
