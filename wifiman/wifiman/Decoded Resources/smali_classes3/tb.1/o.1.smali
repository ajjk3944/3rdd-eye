.class public final synthetic Ltb/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# instance fields
.field public final synthetic a:Ltb/q;

.field public final synthetic b:Lmh/l;

.field public final synthetic c:Ltb/i;


# direct methods
.method public synthetic constructor <init>(Ltb/q;Lmh/l;Ltb/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/o;->a:Ltb/q;

    iput-object p2, p0, Ltb/o;->b:Lmh/l;

    iput-object p3, p0, Ltb/o;->c:Ltb/i;

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 3

    iget-object v0, p0, Ltb/o;->a:Ltb/q;

    iget-object v1, p0, Ltb/o;->b:Lmh/l;

    iget-object v2, p0, Ltb/o;->c:Ltb/i;

    invoke-static {v0, v1, v2, p1}, Ltb/q;->b(Ltb/q;Lmh/l;Ltb/i;Lgg/A;)V

    return-void
.end method
