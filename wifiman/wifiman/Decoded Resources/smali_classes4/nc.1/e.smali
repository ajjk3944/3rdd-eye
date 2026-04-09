.class public final synthetic Lnc/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lec/a;

.field public final synthetic b:Ljava/io/File;

.field public final synthetic c:Lnc/i;

.field public final synthetic d:Lec/a;


# direct methods
.method public synthetic constructor <init>(Lec/a;Ljava/io/File;Lnc/i;Lec/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnc/e;->a:Lec/a;

    iput-object p2, p0, Lnc/e;->b:Ljava/io/File;

    iput-object p3, p0, Lnc/e;->c:Lnc/i;

    iput-object p4, p0, Lnc/e;->d:Lec/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lnc/e;->a:Lec/a;

    iget-object v1, p0, Lnc/e;->b:Ljava/io/File;

    iget-object v2, p0, Lnc/e;->c:Lnc/i;

    iget-object v3, p0, Lnc/e;->d:Lec/a;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, v1, v2, v3, p1}, Lnc/i;->l(Lec/a;Ljava/io/File;Lnc/i;Lec/a;Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method
