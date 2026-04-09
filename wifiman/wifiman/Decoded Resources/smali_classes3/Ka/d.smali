.class public final synthetic LKa/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lspeedtest/SpeedtestStatusCallback;


# instance fields
.field public final synthetic a:LKi/t;


# direct methods
.method public synthetic constructor <init>(LKi/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKa/d;->a:LKi/t;

    return-void
.end method


# virtual methods
.method public final onChanged(JJJJLspeedtest/SpeedtestError;)V
    .locals 11

    move-object v0, p0

    iget-object v1, v0, LKa/d;->a:LKi/t;

    move-wide v2, p1

    move-wide v4, p3

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-object/from16 v10, p9

    invoke-static/range {v1 .. v10}, LKa/e$a;->n(LKi/t;JJJJLspeedtest/SpeedtestError;)V

    return-void
.end method
