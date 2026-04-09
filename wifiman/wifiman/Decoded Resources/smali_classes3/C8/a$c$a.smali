.class final LC8/a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC8/a$c;->a(Ljava/lang/Boolean;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC8/a;


# direct methods
.method constructor <init>(LC8/a;)V
    .locals 0

    iput-object p1, p0, LC8/a$c$a;->a:LC8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "nameString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LC8/a$c$a;->a:LC8/a;

    invoke-static {v0, p1}, LC8/a;->s0(LC8/a;Ljava/lang/String;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LC8/a$c$a;->a(Ljava/lang/String;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
