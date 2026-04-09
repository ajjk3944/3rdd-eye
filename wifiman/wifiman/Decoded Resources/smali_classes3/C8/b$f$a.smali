.class final LC8/b$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC8/b$f;->a(Ljava/lang/String;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LC8/b$f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC8/b$f$a;

    invoke-direct {v0}, LC8/b$f$a;-><init>()V

    sput-object v0, LC8/b$f$a;->a:LC8/b$f$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lgg/r;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnd/f;

    new-instance v0, LC8/b$f$a$a;

    invoke-direct {v0, p1}, LC8/b$f$a$a;-><init>(Lnd/f;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LC8/b$f$a;->a(Ll9/a;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
