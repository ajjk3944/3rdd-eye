.class final Lwd/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwd/e;->f()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lwd/e$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwd/e$c;

    invoke-direct {v0}, Lwd/e$c;-><init>()V

    sput-object v0, Lwd/e$c;->a:Lwd/e$c;

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

    check-cast p3, Ll9/a;

    invoke-virtual {p0, p1, p2, p3}, Lwd/e$c;->b(Ll9/a;Ll9/a;Ll9/a;)Lxd/c;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;Ll9/a;Ll9/a;)Lxd/c;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljd/a$b;

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lzi/j;

    invoke-virtual {p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LSd/d$b;

    new-instance v0, Lxd/c;

    invoke-direct {v0, p1, p2, p3}, Lxd/c;-><init>(Ljd/a$b;Lzi/j;LSd/d$b;)V

    return-object v0
.end method
