.class public final synthetic Lnc/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:[Ljava/io/File;

.field public final synthetic b:Lnc/i;

.field public final synthetic c:Lec/a;

.field public final synthetic d:Lec/a;

.field public final synthetic e:Lec/a;

.field public final synthetic f:Lec/a;


# direct methods
.method public synthetic constructor <init>([Ljava/io/File;Lnc/i;Lec/a;Lec/a;Lec/a;Lec/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnc/g;->a:[Ljava/io/File;

    iput-object p2, p0, Lnc/g;->b:Lnc/i;

    iput-object p3, p0, Lnc/g;->c:Lec/a;

    iput-object p4, p0, Lnc/g;->d:Lec/a;

    iput-object p5, p0, Lnc/g;->e:Lec/a;

    iput-object p6, p0, Lnc/g;->f:Lec/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lnc/g;->a:[Ljava/io/File;

    iget-object v1, p0, Lnc/g;->b:Lnc/i;

    iget-object v2, p0, Lnc/g;->c:Lec/a;

    iget-object v3, p0, Lnc/g;->d:Lec/a;

    iget-object v4, p0, Lnc/g;->e:Lec/a;

    iget-object v5, p0, Lnc/g;->f:Lec/a;

    move-object v6, p1

    check-cast v6, Landroid/content/Context;

    invoke-static/range {v0 .. v6}, Lnc/i;->i([Ljava/io/File;Lnc/i;Lec/a;Lec/a;Lec/a;Lec/a;Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method
