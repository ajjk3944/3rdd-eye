.class public final synthetic Lnc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ljava/io/File;

.field public final synthetic b:Lnc/i;

.field public final synthetic c:Lec/a;


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;Lnc/i;Lec/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnc/d;->a:Ljava/io/File;

    iput-object p2, p0, Lnc/d;->b:Lnc/i;

    iput-object p3, p0, Lnc/d;->c:Lec/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lnc/d;->a:Ljava/io/File;

    iget-object v1, p0, Lnc/d;->b:Lnc/i;

    iget-object v2, p0, Lnc/d;->c:Lec/a;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, v1, v2, p1}, Lnc/i;->j(Ljava/io/File;Lnc/i;Lec/a;Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method
