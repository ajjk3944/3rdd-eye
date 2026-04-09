.class public final Lui/n;
.super Lui/a$a;
.source "SourceFile"

# interfaces
.implements Lph/c;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Lui/a$a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lth/l;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lui/a;

    invoke-virtual {p0, p1, p2}, Lui/n;->d(Lui/a;Lth/l;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Lui/a;Lth/l;)Ljava/lang/Object;
    .locals 1

    const-string v0, "thisRef"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lui/a$a;->c(Lui/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
