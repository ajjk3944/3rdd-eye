.class public final synthetic Lxe/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lxe/r0;

.field public final synthetic b:LN/n0;

.field public final synthetic c:Lxe/f$b;


# direct methods
.method public synthetic constructor <init>(Lxe/r0;LN/n0;Lxe/f$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxe/z;->a:Lxe/r0;

    iput-object p2, p0, Lxe/z;->b:LN/n0;

    iput-object p3, p0, Lxe/z;->c:Lxe/f$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lxe/z;->a:Lxe/r0;

    iget-object v1, p0, Lxe/z;->b:LN/n0;

    iget-object v2, p0, Lxe/z;->c:Lxe/f$b;

    check-cast p1, Lf2/u;

    invoke-static {v0, v1, v2, p1}, Lxe/B$a$a;->a(Lxe/r0;LN/n0;Lxe/f$b;Lf2/u;)LYg/J;

    move-result-object p1

    return-object p1
.end method
