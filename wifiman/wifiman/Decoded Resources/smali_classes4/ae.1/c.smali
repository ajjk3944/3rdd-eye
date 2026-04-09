.class public final Lae/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lae/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lae/c$a;
    }
.end annotation


# static fields
.field public static final c:Lae/c$a;


# instance fields
.field private final a:Lnc/j;

.field private final b:Lnc/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lae/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lae/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lae/c;->c:Lae/c$a;

    return-void
.end method

.method public constructor <init>(Lnc/j;Lnc/a;)V
    .locals 1

    const-string v0, "intentService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lae/c;->a:Lnc/j;

    iput-object p2, p0, Lae/c;->b:Lnc/a;

    return-void
.end method

.method public static final synthetic b(Lae/c;)Lnc/a;
    .locals 0

    iget-object p0, p0, Lae/c;->b:Lnc/a;

    return-object p0
.end method

.method public static final synthetic c(Lae/c;)Lnc/j;
    .locals 0

    iget-object p0, p0, Lae/c;->a:Lnc/j;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/util/UUID;Ljava/lang/String;Lh9/a;)Lgg/z;
    .locals 1

    const-string v0, "ssoAccountId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consoleId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceMac"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lae/c$d;

    invoke-direct {v0, p0, p1, p2, p3}, Lae/c$d;-><init>(Lae/c;Ljava/util/UUID;Ljava/lang/String;Lh9/a;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string p2, "subscribeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
