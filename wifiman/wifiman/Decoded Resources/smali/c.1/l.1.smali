.class public final synthetic Lc/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/j$g;

.field public final synthetic b:I

.field public final synthetic c:Lg/a$a;


# direct methods
.method public synthetic constructor <init>(Lc/j$g;ILg/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/l;->a:Lc/j$g;

    iput p2, p0, Lc/l;->b:I

    iput-object p3, p0, Lc/l;->c:Lg/a$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc/l;->a:Lc/j$g;

    iget v1, p0, Lc/l;->b:I

    iget-object v2, p0, Lc/l;->c:Lg/a$a;

    invoke-static {v0, v1, v2}, Lc/j$g;->o(Lc/j$g;ILg/a$a;)V

    return-void
.end method
