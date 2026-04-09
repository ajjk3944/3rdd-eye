.class final Ljd/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljd/c;-><init>(LZc/f;LZc/a;Lje/u;LDc/e;Lbe/e;LCc/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ljd/c$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljd/c$e;

    invoke-direct {v0}, Ljd/c$e;-><init>()V

    sput-object v0, Ljd/c$e;->a:Ljd/c$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    check-cast p2, Ll9/a;

    check-cast p3, La8/a;

    invoke-virtual {p0, p1, p2, p3}, Ljd/c$e;->b(Ll9/a;Ll9/a;La8/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;Ll9/a;La8/a;)Ll9/a;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "devices"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La8/b;

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LCc/a;

    if-eqz p1, :cond_0

    invoke-virtual {p3, p1}, La8/a;->a(La8/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LCc/a$b;

    if-eqz p1, :cond_0

    move-object p2, p1

    :cond_0
    new-instance p1, Ll9/a;

    invoke-direct {p1, p2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method
