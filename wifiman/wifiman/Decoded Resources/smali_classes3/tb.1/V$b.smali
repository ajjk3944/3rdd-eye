.class final Ltb/V$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltb/V;->i(Ljava/lang/String;Llb/b;Lpb/l;Llb/c;ZLmh/l;)Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ltb/V$b;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ltb/u;)Lgg/v;
    .locals 3

    invoke-virtual {p1}, Ltb/u;->e()Lgg/s;

    move-result-object v0

    new-instance v1, Ltb/V$b$a;

    iget-object v2, p0, Ltb/V$b;->a:Ljava/lang/String;

    invoke-direct {v1, v2}, Ltb/V$b$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/s;->F(Lkg/f;)Lgg/s;

    move-result-object v0

    sget-object v1, Ltb/V$b$b;->a:Ltb/V$b$b;

    invoke-virtual {v0, v1}, Lgg/s;->N(Lkg/p;)Lgg/s;

    move-result-object v0

    new-instance v1, Ltb/V$b$c;

    invoke-direct {v1, p1}, Ltb/V$b$c;-><init>(Ltb/u;)V

    invoke-virtual {v0, v1}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ltb/u;

    invoke-virtual {p0, p1}, Ltb/V$b;->a(Ltb/u;)Lgg/v;

    move-result-object p1

    return-object p1
.end method
