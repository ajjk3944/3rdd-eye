.class final LC8/b$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC8/b;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC8/b;


# direct methods
.method constructor <init>(LC8/b;)V
    .locals 0

    iput-object p1, p0, LC8/b$f;->a:LC8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)LDj/a;
    .locals 1

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LC8/b$f;->a:LC8/b;

    invoke-static {v0}, LC8/b;->s0(LC8/b;)Lnd/g;

    move-result-object v0

    invoke-interface {v0, p1}, Lnd/g;->e(Ljava/lang/String;)Lgg/i;

    move-result-object p1

    sget-object v0, LC8/b$f$a;->a:LC8/b$f$a;

    invoke-virtual {p1, v0}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LC8/b$f;->a(Ljava/lang/String;)LDj/a;

    move-result-object p1

    return-object p1
.end method
