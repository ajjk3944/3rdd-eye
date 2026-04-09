.class public final synthetic LF9/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lmh/l;

.field public final synthetic b:LF9/C;


# direct methods
.method public synthetic constructor <init>(Lmh/l;LF9/C;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF9/D;->a:Lmh/l;

    iput-object p2, p0, LF9/D;->b:LF9/C;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LF9/D;->a:Lmh/l;

    iget-object v1, p0, LF9/D;->b:LF9/C;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, LF9/F;->a(Lmh/l;LF9/C;Z)LYg/J;

    move-result-object p1

    return-object p1
.end method
