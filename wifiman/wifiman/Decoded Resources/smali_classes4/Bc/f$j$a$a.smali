.class final LBc/f$j$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBc/f$j$a;->a(LBc/f$c;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LBc/f$j$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LBc/f$j$a$a;

    invoke-direct {v0}, LBc/f$j$a$a;-><init>()V

    sput-object v0, LBc/f$j$a$a;->a:LBc/f$j$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LBc/a$a;LBc/f$b$a;)LBc/a$b$a$b;
    .locals 2

    const-string v0, "signal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkTypeEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LBc/f$b$a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LBc/a$a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LBc/a$a;->a()LV7/a;

    move-result-object p1

    invoke-virtual {p2}, LBc/f$b$a;->a()LV7/b;

    move-result-object p2

    new-instance v1, LBc/a$b$a$b$a;

    invoke-direct {v1, v0, p2, p1}, LBc/a$b$a$b$a;-><init>(Ljava/lang/String;LV7/b;LV7/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LBc/a$a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LBc/a$a;->a()LV7/a;

    move-result-object p1

    invoke-virtual {p2}, LBc/f$b$a;->a()LV7/b;

    move-result-object p2

    new-instance v1, LBc/a$b$a$b$b;

    invoke-direct {v1, v0, p2, p1}, LBc/a$b$a$b$b;-><init>(Ljava/lang/String;LV7/b;LV7/a;)V

    :goto_0
    return-object v1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBc/a$a;

    check-cast p2, LBc/f$b$a;

    invoke-virtual {p0, p1, p2}, LBc/f$j$a$a;->a(LBc/a$a;LBc/f$b$a;)LBc/a$b$a$b;

    move-result-object p1

    return-object p1
.end method
