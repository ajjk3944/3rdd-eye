.class public final synthetic Ltb/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# instance fields
.field public final synthetic a:Ltb/u;

.field public final synthetic b:Lmh/l;


# direct methods
.method public synthetic constructor <init>(Ltb/u;Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/s;->a:Ltb/u;

    iput-object p2, p0, Ltb/s;->b:Lmh/l;

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    iget-object v0, p0, Ltb/s;->a:Ltb/u;

    iget-object v1, p0, Ltb/s;->b:Lmh/l;

    invoke-static {v0, v1, p1}, Ltb/u;->b(Ltb/u;Lmh/l;Lgg/A;)V

    return-void
.end method
