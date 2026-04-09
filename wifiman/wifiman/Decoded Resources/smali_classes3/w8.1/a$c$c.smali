.class final Lw8/a$c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw8/a$c;->a(Ljava/lang/String;)Lgg/D;
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

    iput-object p1, p0, Lw8/a$c$c;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;Lld/a;)Li8/a$b$D$d;
    .locals 7

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "session"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    new-instance v1, Lec/a$b;

    const-string/jumbo v0, "wifimanmobilefeedback@ui.com"

    invoke-direct {v1, v0}, Lec/a$b;-><init>(Ljava/lang/CharSequence;)V

    new-instance v2, Lec/a$a;

    invoke-virtual {p2}, Lld/a;->a()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const v0, 0x7f110104

    invoke-direct {v2, v0, p2}, Lec/a$a;-><init>(I[Ljava/lang/Object;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lw8/a$c$c;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    new-instance v3, Lec/a$b;

    invoke-direct {v3, p2}, Lec/a$b;-><init>(Ljava/lang/CharSequence;)V

    new-instance p1, Li8/a$b$D$d;

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Li8/a$b$D$d;-><init>(Lec/a;Lec/a;Lec/a;Ljava/io/File;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Lld/a;

    invoke-virtual {p0, p1, p2}, Lw8/a$c$c;->a(Ll9/a;Lld/a;)Li8/a$b$D$d;

    move-result-object p1

    return-object p1
.end method
