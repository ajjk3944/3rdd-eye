.class public final LAc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAc/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAc/b$a;
    }
.end annotation


# static fields
.field public static final c:LAc/b$a;


# instance fields
.field private final a:Lcom/ui/wifiman/model/vendor/d$b;

.field private final b:Lgg/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LAc/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LAc/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LAc/b;->c:LAc/b$a;

    return-void
.end method

.method public constructor <init>(Lcom/ui/wifiman/model/vendor/d$b;)V
    .locals 1

    const-string v0, "vendorManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAc/b;->a:Lcom/ui/wifiman/model/vendor/d$b;

    new-instance p1, LAc/b$c;

    invoke-direct {p1, p0}, LAc/b$c;-><init>(LAc/b;)V

    invoke-static {p1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->e()Lgg/z;

    move-result-object p1

    const-string v0, "cache(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LAc/b;->b:Lgg/z;

    return-void
.end method

.method public static final synthetic b(LAc/b;)Lcom/ui/wifiman/model/vendor/d$b;
    .locals 0

    iget-object p0, p0, LAc/b;->a:Lcom/ui/wifiman/model/vendor/d$b;

    return-object p0
.end method


# virtual methods
.method public a()Lgg/z;
    .locals 1

    iget-object v0, p0, LAc/b;->b:Lgg/z;

    return-object v0
.end method
