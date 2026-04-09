.class public final synthetic Lv9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:LT/z1;

.field public final synthetic c:Lm0/U0;


# direct methods
.method public synthetic constructor <init>(JLT/z1;Lm0/U0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lv9/b;->a:J

    iput-object p3, p0, Lv9/b;->b:LT/z1;

    iput-object p4, p0, Lv9/b;->c:Lm0/U0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-wide v0, p0, Lv9/b;->a:J

    iget-object v2, p0, Lv9/b;->b:LT/z1;

    iget-object v3, p0, Lv9/b;->c:Lm0/U0;

    check-cast p1, Lo0/f;

    invoke-static {v0, v1, v2, v3, p1}, Lv9/d;->a(JLT/z1;Lm0/U0;Lo0/f;)LYg/J;

    move-result-object p1

    return-object p1
.end method
